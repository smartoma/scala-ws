package test.M_implicitclass

import org.scalatest.{Matchers, FlatSpec}
import M_implicitclass.DomainSpecificLanguage

class DomainSpecificLanguageSpec extends FlatSpec with Matchers {

  "A DSL" should "create a valid string" in {

    DomainSpecificLanguage.toString shouldEqual "Using Scala allows to write awesome applications"
  }

}
