package br.com.mystudies.scala.functions

import scala.collection.immutable.Range
import scala.collection.mutable.LinkedList
import scala.collection.mutable.AbstractBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap
import scala.math._

object Main extends App {



  def values(func: Int => Int, low: Int, high: Int){

	  var x = ArrayBuffer.empty[(Int, Int)]

	  for( i <- low to high ){
		  x +=  i -> func(i)
	  }

	  println(x)
  }

  values(x => x * x  , -5, 5)




  /*print(1 to 9)*/

  (1 to 9).map(x => 10 * x).foreach(x => println(x))
  // why is the same statemnte abouve
  (1 to 9).map(10 * _).foreach(println _)


  /*(1 to 9).map(_ * "a").foreach(println _)*/ // pq dont compile ?

  (1 to 9).map("*" * _).foreach(println _)
  (1 to 9).map(x => "*" * x).foreach(println _)

   println((1 to 9).reduceLeft(_+_))





   // function with function parameters


































}