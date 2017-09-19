

package br.com.mystudies.scala

object StatementTermination extends App {


  // the semicolon and curly braces is optional when have only one statement in line
  def foo1(x: Int, y:Int) = x + y

  // but when have more  than one statement it is not optional.
  def foo2(x: Int, y: Int) = { val z = x + y; z + 1}

  // the code above can write without semicolon like:
  def foo3(x: Int, y: Int) = {
    val z = x + y
    z + 1
  }







  println(foo1(2,2))
  println(foo2(2,2))
  println(foo3(2,2))

}