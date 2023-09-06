1 + 1

val x = 42

x * x

"Hello, World!".length

1.+(2.*(3))

val houseAreaInSqMeters = 5 * 3
val doorAreaInSqMeters = 1 * 2
val paintAreaInSqMeters = houseAreaInSqMeters - doorAreaInSqMeters

(1 < 2) && (2 < 3)

// val a = 1 / 01 // error: zero division

// val a = 1 && "Sound and vision" // Does not compile

// Alice's house paint
val aliceFacade = 5 * 3
val aliceDoor = 2 * 1
val aliceWindow = 1 * 1
val alicePaint = aliceFacade - aliceDoor - aliceWindow * 2

// Bob's house paint
val bobFacade = 4 * 4
val bobDoor = 2 * 1
val bobWindow = 1.5 * 1
val bobPaint = bobFacade - bobDoor - bobWindow * 2

def house(facade: Double, window: Double): Double =
    val door = 2 * 1
    val doorAndWindows = door + window * 2
    facade - doorAndWindows

val alicePaint2 = house(5 * 3, 1 * 1)
val bobPaint2 = house(4 * 4, 1.5 * 1)

val a = 3

if a > 2 && a < 3 then
  10
else if a > 3 then
  2
else if a > 2 then
  4
else
  8

// val n: Int = ??? // Missing implementation
// println(n.abs)

case class Rect(width: Double, height: Double):
  val area = width * height

case class Square(width: Double):
  val area = width * width

case class Circle(radius: Double):
  val area = math.Pi * radius * radius

val facade = Rect(5, 3)
val bigFacade = facade.copy(width = facade.width * 2, height = facade.height * 2)

case class Person(name: String, age: Int)

val alice = Person("Alice", 42)
val alice2 = alice.copy(age = 43)

