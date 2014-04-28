package test.I_caseclassesandpatternmatching

import org.scalatest.{FlatSpec, Matchers}
import I_caseclassesandpatternmatching.{ListPattern, IntPattern, StringPattern, Patterns}

class PatternsSpec extends FlatSpec with Matchers{
  
  "A match of a StringPattern" should "return Hello Foo on foo" in {
    Patterns(StringPattern("foo")) shouldEqual "Hello, Foo!"
  }

  it should "otherwise return Hello Stranger" in {
    Patterns(StringPattern("bar")) shouldEqual "Hello, Stranger!"
  }

  an[NullPointerException] should be thrownBy {
    Patterns(StringPattern(null))
  }

  "A match of an IntPattern" should "simply return a positive number" in {
    Patterns(IntPattern(17)) shouldEqual "17"
  }

  it should "return nothing on a negative number" in {
    Patterns(IntPattern(-12)) shouldEqual "nothing"
  }

  "A match of a ListPattern" should "return empty for an empty list" in {
    Patterns(ListPattern(Nil)) shouldEqual "empty"
  }

  it should "otherwise return the number of elements" in {
    Patterns(ListPattern(List(2, 5, 7))) shouldEqual "3"
  }

}
