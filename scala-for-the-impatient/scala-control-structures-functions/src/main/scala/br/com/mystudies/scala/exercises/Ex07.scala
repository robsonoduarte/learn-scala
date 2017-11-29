package br.com.mystudies.scala.exercises

/**
 * Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
 */
object Ex07 extends App {


  def product(s: String ) = s.map(_.toLong).product

  println( product("Hello") == 9415087488L)

}