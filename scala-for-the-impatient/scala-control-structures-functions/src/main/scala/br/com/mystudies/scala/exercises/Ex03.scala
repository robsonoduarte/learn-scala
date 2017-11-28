package br.com.mystudies.scala.exercises

/**
 * Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x .)
 */
object Ex3 extends App {

  var y = 0

  val x = y = 1

  println(y)
  println(x)
}