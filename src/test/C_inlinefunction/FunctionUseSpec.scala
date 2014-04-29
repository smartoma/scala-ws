package test.C_inlinefunction

import org.scalatest.{FlatSpec, Matchers}
import C_inlinefunction.FunctionUse

class FunctionUseSpec extends FlatSpec with Matchers {

  "A wrapped function" should "compute the number of characters of a string" in {
    FunctionUse.wrap(s => s + "bar")("foo") shouldEqual 6
  }
}
