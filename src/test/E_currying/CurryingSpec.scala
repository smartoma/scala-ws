package test.E_currying

import org.scalatest._
import E_currying.Currying._

class CurryingSpec extends FlatSpec with Matchers {

  "Function 'addTwoTo' " should "add 2 to the given argument." in {
    assert(addTwoTo(3) == 5)
  }
}
