package test.L_foryield

import org.scalatest._
import L_foryield.ForYield._

class ForYieldSpec extends FlatSpec with Matchers {

  "Doubled numbers " should "contain numbers multipled with 2" in {
    assert(doubledNumbers.size == 5)
    assert(doubledNumbers.forall(_%2 == 0))
  }

  "Numbers greater than three " should "contain only numbers > 3" in {
    assert(numbersGreaterThanThree.size == 2)
    assert(numbersGreaterThanThree.forall(_ > 3))
  }
}
