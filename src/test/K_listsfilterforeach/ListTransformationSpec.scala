package test.K_listsfilterforeach

import org.scalatest.{Matchers, FlatSpec}
import K_listsfilterforeach.ListTransformation

class ListTransformationSpec extends FlatSpec with Matchers {
  
  "A filtered list" should "only contain string character lengths" in {
    ListTransformation(List("foo", 123, 7, "bar", 15, new java.lang.Object, "test")) shouldEqual List(123, 7, 3, 15, 4)
  }

}
