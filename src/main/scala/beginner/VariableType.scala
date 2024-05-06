package beginner

object VariableType extends App {
  // immutable
  val constantValue: Int = 31
  println(constantValue) // 31
//  constantValue = 21 // -> compilation error 유발

  // mutable
  var mutableValue = 10
  mutableValue = 20
  println(mutableValue) // 20

  // type inference
  val number = 42
  println(number.isInstanceOf[Int]) // true

  var name = "Scala"
  println(name.isInstanceOf[String]) // true

  // built in data types
  val byteVal: Byte = 10
  println(byteVal)
  val shortVal: Short = 100
  println(shortVal)
  val intVal: Int = 1000
  println(intVal)
  val longVal: Long = 10000L
  println(longVal)
  val floatVal: Float = 10.5f
  println(floatVal)
  val doubleVal: Double = 10.5
  println(doubleVal)
  val charVal: Char = 'A'
  println(charVal)
  val booleanVal: Boolean = true
  println(booleanVal)
  val stringVal: String = "Hello, Scala"
  println(stringVal)


}
