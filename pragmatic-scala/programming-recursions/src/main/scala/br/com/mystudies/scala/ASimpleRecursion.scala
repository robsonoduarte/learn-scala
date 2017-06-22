package br.com.mystudies.scala

object ASimpleRecursion extends App {


  println(factorial(5))
  println(factorial(10000)) // java.lang.StackOverflowError


  def factorial(number: Int): BigInt = {
    if(number == 0 ) 1
    else number * factorial(number - 1)
  }

}