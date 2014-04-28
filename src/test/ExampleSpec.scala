import collection.mutable.Stack
import org.scalatest._

class ExampleSpec extends FlatSpec with Matchers {

  "A message " should "be printed to console" in {
    println("Hello world")
  }

  it should "print 'hello world' " in {
    println("Hello world")
  }
}
