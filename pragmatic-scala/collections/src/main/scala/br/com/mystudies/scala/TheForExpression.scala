

package br.com.mystudies.scala

object TheForExpression extends App {

  // simple for
  for(i <- 1 to 3) {print("ho ")}

  println()

  // use yield
  val result = for(i <- 1 to 10) yield i * 2
  print(result)

}
