package br.com.mystudies.scala.higher.order.functions

object Closures extends App {

  // The function mulby have a parameter (factor) that will used in another function returned.
  // this parameter is in enclosing scope than the function returned can use it.
  def mulBy(factor: Double) = (x: Double) => factor * x


  // return on function with factor = 3
  val triple = mulBy(3)

  // use the triple function with parameter in enclosing scope.
  println( triple(3) )

  // FOR more information about Closures see -->  http://en.wikipedia.org/wiki/Closure_%28computer_programming%29

}