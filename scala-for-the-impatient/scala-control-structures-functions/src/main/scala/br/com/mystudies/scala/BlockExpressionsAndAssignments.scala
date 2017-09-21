package br.com.mystudies.scala

object BlockExpressionsAndAssignments extends App {


  // the value of the block is the value of last expression
  def foo1() = { val x = 10; val y = 10; x * y}

  // when assignments have no value the expression is Unit( equivalent of void in Java )
  def foo2() = { var x = 10; x += 10}


  println(foo1)
  println(foo2)

}