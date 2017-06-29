package br.com.mystudies.scala

import scala.io.StdIn

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



  // add sides effect when use the lazy variables
  import scala.io

  def read = StdIn.readInt

  lazy val first = read
  lazy val second = read

  if(Math.random() < 0.5 )
    second // here the second variable is evaluated before the first generation the side effect in computation

  println(first - second)

}