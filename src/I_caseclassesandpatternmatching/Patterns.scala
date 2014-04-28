package I_caseclassesandpatternmatching

abstract sealed class Patterns

case class StringPattern(value: String) extends Patterns

case class IntPattern(value: Int) extends Patterns

case class ListPattern(value: List[Any]) extends Patterns

object Patterns {

  // The following method should return the following values:
  // 1. On StringPattern("foo") it should return "Hello, Foo!"
  // 2. On any other StringPattern it should return "Hello, Stranger!"
  // 3. On a StringPattern with a null value, it should throw a NullPointerException
  // 4. On an IntPattern with a positive value, it should simply return a string version of the number
  // 5. On an IntPattern with a negative value, it should return the value "nothing"
  // 5. On a list pattern of an empty list, it should return a "empty"
  // 6. Otherwise, it should return a string with the number of elements.

  def apply(pattern: Patterns): String = null

}
