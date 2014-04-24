package simple

object HelloWorld extends App {

  // For å komme i gang med Scala skal skal vi implementere en enkel kommandolinjeparser.
  // Tenk for exampel om noen enkel Unix applikasjon som kan startes med flere argumenter.
  // Lovelige argumenter for vår applikasjon er
  //   -h --hello
  //   -v --verbose
  // Bruk av andre argumenter skal resultere i en feilmelding.
  // Når bare lovelige argumenter blir brukt, så skal applikasjonen skrive ut hvilke argumenter ble
  // brukt. Når "verbose" er satset, så skal "Hello World" skrives ut i tillegg.

  // Man skal:
  //  - bruke for-comprehension (http://www.scala-lang.org/old/node/111)
  //  - bruke pattern matching (http://www.tutorialspoint.com/scala/scala_pattern_matching.htm)
  //  - ikke bruke mutable variabler eller data structures
  //  - ikke google etter en ferdig løsning

  // OBS! App er en "ferdig lagt" application entry point for Java hvor objektconstructoren tilsvarer main metoden.
  //      Argumentene av main metode invokasjon er tilgjengelige som "args" variable.
}
