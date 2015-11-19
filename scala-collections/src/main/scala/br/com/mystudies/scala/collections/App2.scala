package br.com.mystudies.scala.collections

import scala.collection.immutable.HashMap
import scala.collection.immutable.HashSet




object App2 extends App {
     
   def removeZeroes(list : List[Int] ) = {
       list filterNot(_ == 0)
   }
   
   
   println(removeZeroes(List(1, 2, 0, 3, 0)))
   
  
   
     
   
   def indexes(world : String ) = {
		   var map =  HashMap.empty[Char, HashSet[Int]];     
		   world foreach( c => {
			   map = map + ( c -> HashSet.empty.+(  world.indexOf(c))) 
		   })     
		   map
   }
   
   
   
   
   println(indexes("ROBSON OLIVEIRA DUARTE"))
}

  