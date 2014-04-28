package test.D_partiallyappliedfunctions

import org.scalatest._
import D_partiallyappliedfunctions.PartiallyAppliedFunctions.addingThreeTo

class PartialFunctionsSpec extends FlatSpec with Matchers {

  "Function 'addingThreeTo' " should "add 3 to given argument." in {
    assert(addingThreeTo(2) == 5)
  }
}
