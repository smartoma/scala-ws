package test.H_traits

import org.scalatest.{Matchers, FlatSpec}
import H_traits.Greeting
import H_traits.Greeting.Greeter

class GreetingSpec extends FlatSpec with Matchers {

  "A message" should "be printed to console" in {

    val stream = new java.io.ByteArrayOutputStream()

    Console.withOut(stream) {
      Greeting.makeLoggingGreeter().greet("World").trim shouldEqual "Hello, World"
    }

    stream.toString.trim shouldEqual "Hello, World"
  }
}
