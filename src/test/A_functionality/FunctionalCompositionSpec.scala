package test.A_functionality

import org.scalatest.{Matchers, FlatSpec}
import A_functionality.FunctionalComposition

class FunctionalCompositionSpec extends FlatSpec with Matchers {

  "The composed function" should "print and return Hello World" in {

    val stream = new java.io.ByteArrayOutputStream

    Console.withOut(stream) {
      FunctionalComposition.getGreetingPrinter("World").trim shouldBe "Hello, World!"
    }

    stream.toString.trim shouldEqual "Hello, World!"

  }

}
