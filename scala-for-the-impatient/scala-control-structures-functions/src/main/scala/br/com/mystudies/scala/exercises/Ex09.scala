package br.com.mystudies.scala.exercises

/**
 * Make the function of the preceding exercise a recursive function.
 */
object Ex09 extends App {

  def product(s: String ): Long = if( s.tail != "") s.head.toLong * product(s.tail) else s.head.toLong


  println( product("Hello") == 9415087488L )
}