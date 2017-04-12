package br.com.mystudies.scala

object Closures extends App {

  def loopThrough(number:Int)(closure: Int => Unit) {
    for(i <- 1 to number) {
      closure(i)
    }
  }

  var result = 0
  val addIt = {value:Int => result += value}

  loopThrough(10)(element => addIt(element))
  println(s"Total of values from 1 to 10 is $result")

  result = 0

  loopThrough(5)(addIt)
  println(s"Total of values from 1 to 10 is $result")


  var product = 1
  loopThrough(5){value:Int => product *= value }
  println(s"Product of values from 1 to 10 is $product")


  product = 1
  loopThrough(5)(product *= _)
  println(s"Product of values from 1 to 10 is $product")
}
