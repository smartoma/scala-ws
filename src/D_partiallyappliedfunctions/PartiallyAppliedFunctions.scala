package D_partiallyappliedfunctions

object PartiallyAppliedFunctions {

  // Don't touch me.
  def addition(first: Int, second: Int) = first + second

  // Replace 'null' with a partially applied function 'addition', which adds 3 to the given argument.
  // http://twitter.github.io/scala_school/basics.html#functions
  // Check that test passes.
  def addingThreeTo:Int => Int = null
}
