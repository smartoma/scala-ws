package test.G_companionobjectapply

import org.scalatest.{Matchers, FlatSpec}
import G_companionobjectapply.{StringCompanion, IntCompanion, Companion}

class CompanionSpec extends FlatSpec with Matchers {

  "A companion" should "return an int companion with an int argument" in {
    Companion(41) shouldBe classOf[IntCompanion]
  }

  it should "return a string companion with a string argument" in {
    Companion("foo") shouldBe classOf[StringCompanion]
  }

  an[IllegalArgumentException] should be thrownBy {
    Companion(List())
  }
}
