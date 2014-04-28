package A_functionality

object FunctionalComposition {

  def greet(person: String) = "Hello " + person + "!"
  def printer(text: String) = { println(text); text }

  // Combine the two above functions to a single function
  def getGreetingPrinter: String => String = null
}
