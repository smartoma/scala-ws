package F_functionalcomposition

object FunctionalComposition {

  // Don't touch me.
  def addingOneTo(number:Int):Int = number + 1

  // Don't touch me.
  def addingTwoTo(number:Int):Int = number + 2

  // Create a function by combining two earlier functions to one function, which adds 3 to the given argument.
  // Try to use 'andThen' composition.
  // http://twitter.github.io/scala_school/pattern-matching-and-functional-composition.html
  // Check that test passes.
  def addingThreeTo(number:Int):Int = (Nil)(number) // Replace 'Nil' with functional composition.

}
