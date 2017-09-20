package br.com.mystudies.scala

object BlockExpressionsAndAssignments extends App {


  // the value of the block is the value of last expression
  def foo1() = { val x = 10; val y = 10; x * y}





  println(foo1)

}