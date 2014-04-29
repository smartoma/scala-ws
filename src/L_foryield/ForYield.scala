package L_foryield

object ForYield {

  // Don't touch me.
  val numbers = Array(1, 2, 3, 4, 5)

  // Travel over numbers-array and yield a new array, which contains doubled numbers.
  // http://docs.scala-lang.org/tutorials/tour/sequence-comprehensions.html
  // Check that test passes.
  val doubledNumbers = for(Nil <- Nil) yield 1 //Replace both 'Nil's and '1' with your own implementation.

  // Travel over numbers-array and yield a new array, which contains only numbers greater than 3.
  // Check that test passes.
  val numbersGreaterThanThree = for (Nil <- Nil) yield 1 //Replace both 'Nil's and '1' with your own implementation.
}
