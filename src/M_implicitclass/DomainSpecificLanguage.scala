package M_implicitclass

object DomainSpecificLanguage {

  implicit class Language(val word: String) {

  }

  implicit def convert(l: Language): String = l.word

  // Implement Language such that he pseudo-DSL below compiles and creates a valid output.
  // Only alter the Language class and uncomment the line below.

  //override def toString = "Using Scala" allows "to write" awesome "applications"
}
