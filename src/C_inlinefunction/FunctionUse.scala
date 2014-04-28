package C_inlinefunction

object FunctionUse {

  // Create a simple function that lazily computes the number of characters of the string it receives.

  def wrap(f: String => String): String => Int = null
}
