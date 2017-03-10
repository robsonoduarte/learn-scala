package br.com.mystudies.scala

object FunctionValuesMultipeParameters extends App {


  def printValue(generator: () => Int) = {
      println(s"Generated values is ${generator()}")
  }

  printValue { () => 42 }



  def inject(arr: Array[Int], initial: Int, operation: (Int,Int) => Int) = {
    var carryOver = initial
    arr.foreach(elem => carryOver = operation(carryOver,elem))
    carryOver
  }


  val array = Array(2,3,5,1,6,4)
  val sum = inject(array, 0, (x,y) => x + y)
  println(s"Sum of elements in array is $sum")

}