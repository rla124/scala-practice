package beginner

object Expression extends App {
  // basic arithmetic expression
  var sum = 10 + 5
  sum += 10
  println(sum) // 25

  // conditional expression(if-else)
  val a1 = 4
  val a2 = 5
  val max = if (a2 > a1) a1 else a2 // 이것도 expression의 한 예
  println(max) // 4

  // negation
  println(!(1 == 1)) // false

  // block expression
  val blockValue = {
    val a = 10
    val b = 5
    a + b
  }
  println(blockValue) // 15

  // function as an expression
  val multiply = (x: Int, y: Int) => x * y;
  println(multiply(3, 4)) // 12

  // case classes and pattern matching
  case class Point(x: Int, y: Int)
  val point = Point(1, 2)
  val description = point match {
    case Point(0, 0) => "Origin"
    case Point(x, 0) => s"X axis at $x"
    case Point(0, y) => s"Y axis at $y"
    case _ => "Somewhere on the plane"
  }
  println(description) // Somewhere on the plane

  // collection operations
  val numbers = List(1, 2, 3, 4, 5)
  val doubled = numbers.map(_ * 2)
  println(doubled) // List(2, 4, 6, 8, 10)

  println(println(123)) // 123 출력 후 unit () 출력
}
