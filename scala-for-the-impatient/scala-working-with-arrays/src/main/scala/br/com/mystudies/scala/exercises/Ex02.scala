package br.com.mystudies.scala.exercises

/**
 * Write a loop that swaps adjacent elements of an array of integers.
 * For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .
 */
object Ex02 extends App {

   val x = Array(2, 1, 4, 3, 5, 8)


	  for( i <- 0 until x.length if i % 2 != 0){
    			var temp = x(i-1)
    			x(i-1) = x(i)
    			x(i) = temp
		  }


   print(x.deep == Array(1,2,3,4,8,5).deep)

}