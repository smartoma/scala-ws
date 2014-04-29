package E_currying

object Currying {

  // Don't touch me.
  def addNumbers(first:Int, second:Int):Int = first + second

  // Don't touch me.
  def curriedAddNumbers:Int => (Int => Int) = (addNumbers _).curried

  // Create a function which adds 2 to the given argument, by using 'curriedNumbers'-function.
  // http://workwithplay.com/blog/2013/08/28/functional-programming-in-scala-partials-functions-and-currying/
  // Check that test passes.
  val addTwoTo:Int => Int = null

}
