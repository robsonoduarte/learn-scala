package br.com.mystudies.scala.collections

import scala.collection.immutable.HashMap
import scala.collection.immutable.HashSet




object App2 extends App {
  

  
  
  
  def indexes(world : String ) = {
     var map =  HashMap.empty[Char, HashSet[Int]];     
     world foreach( c => {
         map = map + ( c -> HashSet.empty.+(  world.indexOf(c))) 
     })     
     map
  }
    
  
   print(indexes("ROBSON OLIVEIRA DUARTE"))
   
  
}

  