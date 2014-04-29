package test.F_functionalcomposition

import org.scalatest._
import F_functionalcomposition.FunctionalComposition.addingThreeTo

class FunctionalCompositionSpec extends FlatSpec with Matchers {

  "Function 'addingThreeTo' " should "add 3 to given argument." in {
    assert(addingThreeTo(2) == 5)
  }
}
