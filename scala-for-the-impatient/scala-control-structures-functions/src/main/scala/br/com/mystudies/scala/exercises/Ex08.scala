package br.com.mystudies.scala.exercises

/**
 * Write a function product(s : String) that computes the product, as described in the preceding exercises.
 */
object Ex08 extends App {

  def product(s: String ) = s.map(_.toLong).product

  println( product("Hello") == 9415087488L)
}