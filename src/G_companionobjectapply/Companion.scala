package G_companionobjectapply

sealed abstract class Companion

case class StringCompanion private(name: String) extends Companion

case class IntCompanion private(name: Int) extends Companion

// Implement the companion object to create a String- or Int-companion based
// on the value the apply method receives. If a non-matching tye is given, throw an
// IllegalArgumentException. Use pattern matching!

object Companion {
  def apply(name: Any): Companion = null
}
