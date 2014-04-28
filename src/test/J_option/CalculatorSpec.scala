package test.J_option

import org.scalatest.{Matchers, FlatSpec}
import J_option.Calculator

class CalculatorSpec extends FlatSpec with Matchers {

  "A list of optional integers" should "be summed up" in {
    Calculator.sum(List(Some(12), None, Some(23), None, Some(30), Some(-4))) shouldEqual 61
  }

  "A list of no integers" should "be zero" in {
    Calculator.sum(List(None, None)) shouldEqual 0
  }
}
