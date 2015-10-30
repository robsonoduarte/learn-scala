package br.com.mystudies.scala.collections

import java.util.Hashtable
import scala.collection.mutable.HashTable
import scala.collection.immutable.HashMap

object App extends App { 
  List(1, 2, 3, 4 ) foreach { println _}
  
  
 
  
  def fun(world : String ){
    
    var map = HashMap.empty[Int, Char]
    
    
    world foreach { c => map += ( world.indexOf(c) -> c ) }  
    
    map
    
  }
  
  
  
  
   print(fun("Robson"))
  
  
  
}

  