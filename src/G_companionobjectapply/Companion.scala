package G_companionobjectapply

sealed abstract class Companion

case class StringCompanion(name: String) extends Companion

case class IntCompanion(name: Int) extends Companion

// Implement the companion object to create a String- or Int-companion based
// on the value the apply method receives. If a non-matching type is given, throw an
// IllegalArgumentException. Use pattern matching!

object Companion {
  def apply(name: Any): Companion = null
}
