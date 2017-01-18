package br.com.mystudies.scala.types

object ReturnTypeInference extends App {


  def f1 {Math.sinh(4)} // void method ( Unit )
  def f2 = {Math.sinh(4)} // the return is inference by Scala
  def f3 = Math.sinh(4) // the same above but in sort form ( without curly brace )
  def f4: Double = {Math.sinh(4)} // explicit the return



  println(f1)
  println(f2)
  println(f3)
  println(f4)



  /*
    PRINT OS SCALA REPL

    scala> def f1 {Math.sinh(4)}
    f1: Unit

    scala> def f2 = {Math.sinh(4)}
    f2: Double

    scala> def f3 = Math.sinh(4)
    f3: Double

    scala> def f4: Double = {Math.sinh(4)}
    f4: Double

   */


}
