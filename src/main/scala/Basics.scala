object Basics extends App {

  val meaningOfLife: Int= 45;


  val Boolean = false; // type is optional most of the time

  val aString = "I love Scala"

  val me = "Devin says, "

  val quote = me + aString

  val anInterpolatedString = s"The meaning of life is $meaningOfLife"



  // if-statement
  val ifExpression = if(meaningOfLife > 43) 56 else 999
  println(ifExpression)

  // functions

  def myFunction(x: Int, y: String): String = {
    y + " " + x
  }

  println(myFunction(5, "World"))

  // recursive function

  def factorial(n: Int): Int =
    if(n <= 1) 1
    else n * factorial(n -1)

  println(factorial(5))
}
