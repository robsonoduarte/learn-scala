package br.com.mystudies.scala

object TailCallOptimization extends App {


    @scala.annotation.tailrec
    def factorial(fact: BigInt, number: Int) : BigInt = {
      if(number == 0 ) fact
      else factorial(fact * number, number - 1)
    }


    println(factorial(1, 100000))

}
