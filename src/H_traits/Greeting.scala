package H_traits

object Greeting {

  class Greeter {
    def greet(person: String) = "Hello, " + person
  }

  // In this exercise, we want to create a mixin trait that logs a greeting to the console.
  // Only the Logging trait must be altered for this exercise.
  trait Logging

  def makeLoggingGreeter(): Greeter = new Greeter with Logging
}
