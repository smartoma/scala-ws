package test.B_everythingisobject

import org.scalatest._
import B_everythingisobject.EverythingIsObject._

class ObjectSpec extends FlatSpec with Matchers {

  "Variable 'three' " should "have value 3" in {
    assert(three == 3)
  }
  it should "also have correct value for 4" in {
    assert(four == 4)
  }
}
