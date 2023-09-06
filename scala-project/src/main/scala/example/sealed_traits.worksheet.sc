sealed trait Shape
case class Rectangle(width: Int, height: Int) extends Shape
case class Circle(radius: Int) extends Shape


def area(shape: Shape): Double =
  shape match
    case Rectangle(w, h) => w * h
    case Circle(r)       => r * r * Math.PI


sealed trait Action
case class Subscribe(channel: Channel) extends Action
case class Unsubscribe(channel: Channel) extends Action
case class PostMessage(channel: Channel, message: String) extends Action

case class Channel(name: String)

enum PrimaryColors:
  case Red, Green, Blue

PrimaryColors.Red 
PrimaryColors.values
PrimaryColors.valueOf("Green")  


sealed trait User
object User:
  case object Guest extends User
  case class Registered(id: Int) extends User

User.Guest
User.Registered(1)
User