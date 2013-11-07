package br.com.mystudies.scala.functions

import scala.collection.immutable.Range
import scala.collection.mutable.LinkedList
import scala.collection.mutable.AbstractBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap

object Main extends App {

  
  
  def values(func: Int => Int, low: Int, high: Int){
	  
	  var x = new HashMap[Int, Int]
	  
	  for( i <- low to high ){	   
		  x +=  i -> func(high)
	  }
    
	  print(x)
   
  }
  
  
  
  
  
  
  
  
  
  
  
  values(x => x * x  , -5, 5)

  
}