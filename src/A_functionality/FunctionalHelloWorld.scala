package A_functionality

object FunctionalHelloWorld extends App {

  def greet(person: String) = "Hello " + person + "!"
  def printer(text: String) = println(text)

  // Vi vil si Hello World med bare funksjonelle konsepter.

  def executor(s: String): Unit = { }

  executor("World")

}
