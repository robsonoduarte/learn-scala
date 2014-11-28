package br.com.mystudies.scala

// USING THE TRADITIONAL EXERCISE OF PROGRAMMING FOR COMPARE THE JAVA/SCALA AND JAVA EVOLUTION
object PrintTriangle extends App {

   // full syntax
  (1 to 9) map ((x: Int) => "*" * x) foreach ((s: String) =>  println(s))


  // minimal syntax
  (1 to 9) map ("*" * _) foreach (println _)


  // OBS: map ("*" * _) -> In Scala you can multiply a string using arithmetic operator but in Java... -> http://goo.gl/igpyvf


}