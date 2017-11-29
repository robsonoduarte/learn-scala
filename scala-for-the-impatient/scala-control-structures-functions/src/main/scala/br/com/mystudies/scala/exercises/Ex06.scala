package br.com.mystudies.scala.exercises

/**
 * Write a for loop for computing the product of the Unicode codes of all letters in a string.
 * For example, the product of the characters in "Hello" is 9415087488L .
 */
object Ex06 extends App {


  def product(s: String) = {
    var result = 1L
    for( c <- s ) result *= c.toLong
    result
  }


  println( product("Hello") == 9415087488L)

}