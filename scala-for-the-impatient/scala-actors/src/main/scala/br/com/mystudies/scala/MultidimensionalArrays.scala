package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

object MultidimensionalArrays extends App {

  // construct such an array
  val matrix = Array.ofDim[Double](3,4)


  // access element
  matrix(1)(1) = 2.0

  for( row <- 0 to 2){
	  for(col <- 0 to 3 ){
	    print( " " + matrix(row)(col))
	  }
    println()
  }


}