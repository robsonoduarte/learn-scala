package br.com.mystudies.from.scala

object String extends App{


  var scala = """Scala is an acronym for “Scalable Language”.This means that Scala grows with you.
               You can play with it by typing one-line expressions and observing the results.
               But you can also rely on it for large mission critical systems, as many companies, including Twitter, LinkedIn, or Intel do."""

  println(scala)



  // using the strigMargin combination with pipe
  scala = """To some, Scala feels like a scripting language. Its syntax is concise and low ceremony;
           |its types get out of the way because the compiler can infer them.There’s a REPL and IDE worksheets for quick feedback.
           |Developers like it so much that Scala won the ScriptBowl contest at the 2012 JavaOne conference.""".stripMargin

  println(scala)



  // using to regex
  var regex = """[S-s][C-c][A-a][L-l][A-a]"""


  println("scala".matches(regex))
  println("SCALA".matches(regex))
  println("Scala".matches(regex))
  println("Scalas".matches(regex))




  // Interpolation

  val discount = 50


  val message = s"A discount of $discount has been applied"

  print(message)

}