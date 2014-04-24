package simple

object TraitHelloWorld extends App {

  class Greeter {
    def greet(person: String) = "Hello " + person + "!"
  }

  // Vi skal lage en mixin trait som tillatter å skrive ut en greet til konsolen.
  // Greeter classen skal ikke røres men problemet skal løses med en trait.
  // http://gleichmann.wordpress.com/2009/07/19/scala-in-practice-traits-as-mixins-motivation/

  val helloWorld = new Greeter // Bare endre denne linjen
  helloWorld.greet("World")

}
