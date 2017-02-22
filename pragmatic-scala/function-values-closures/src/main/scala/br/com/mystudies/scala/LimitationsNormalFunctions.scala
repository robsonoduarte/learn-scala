package br.com.mystudies.scala

object LimitationsNormalFunctions extends App {


    def sum(number:Int) = {
      var result = 0
      for(i <- 1 to number){
        result += i
      }
      result
    }


    println(sum(10))
}