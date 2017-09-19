

package br.com.mystudies.scala

object StatementTermination extends App {


  // the semicolon and curly braces is optional when have only one statement in line
  def plus(x: Int, y:Int) = x + y

  // but when have more  than one statement it is not optional.
  def plusOne(x: Int, y: Int) = { val z = x + y; z + 1}




  println(plus(2,2))
  println(plusOne(2,2))

}