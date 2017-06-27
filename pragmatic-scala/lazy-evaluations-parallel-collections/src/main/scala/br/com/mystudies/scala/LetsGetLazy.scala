package br.com.mystudies.scala

object LetsGetLazy extends App {

  def expensiveComputation()={
    println("...assume slow operation ")
    false
  }


  def evaluate(input: Int)={
    println(s"evaluate called with $input")
    lazy val perfom = expensiveComputation() // to see the difference of lazy evaluation, commented the lazy world
    if(input >= 10 && perfom)
      println("doing work...")
    else
      println("skipping")
  }


  evaluate(0)
  evaluate(100)

}