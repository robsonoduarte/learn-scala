package br.com.mystudies.scala

import java.lang.Integer._

object FunctionValuesMultipleParameters extends App {


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



  val max = inject(array, MIN_VALUE , (x,y) => Math.max(x, y))
  println(s"Max of elements in array is $max")




  // using the scala library

  val sum2 = array.foldLeft(0){(x,y) => x + y}
  val max2 = array.foldLeft(MIN_VALUE)((x,y) => Math.max(x, y))
  println(s"Sum of elements in array is $sum2")
	println(s"Max of elements in array is $max2")




	// Using the shortcuts names

	val sum3 = (0 /: array){(x,y) => x + y}
  val max3 = (MIN_VALUE /: array)((x,y) => Math.max(x, y))
  println(s"Sum of elements in array is $sum3")
	println(s"Max of elements in array is $max3")




	// Try using currying in inject method

 //val sum4 = inject(array,0){(x,y) => x + y}


	/*
	 * The following problem happens:
	 *
	 * [error] Unspecified value parameter operation.
		 [error] val sum4 = inject(array,0){(x,y) => x + y}
		 [error]                          ^
     [error] one error found
     [error] (compile:compileIncremental) Compilation failed
     [error] Total time: 5 s, completed 17/03/2017 18:24:36
	 */


}