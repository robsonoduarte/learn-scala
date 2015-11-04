package br.com.mystudies.scala.collections

import java.util.Hashtable
import scala.collection.mutable.HashTable
import scala.collection.immutable.HashMap

object App extends App {
  
  
  //List(1, 2, 3, 4 ) foreach { println _}
  
  
 

  def fun(world : String ){
      println(world groupBy ( x => world.indexOf(x) ) )    
      println( world indices )
      println( world toSet  )
      println( world zipWithIndex )
      
      val x = world zipWithIndex;
      
      
      println(x)
      
  }
  
  
   fun("ROBSON")
 
  
}

  