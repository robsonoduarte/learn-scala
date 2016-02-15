 package br.com.mystudies.scala.collections

import scala.collection.immutable.Map
 import scala.collection.immutable.HashMap
 import scala.collection.immutable.HashSet



// Exercise 2
object Ex2 extends App {


   def indexes(world : String ) = {
		   var map =  HashMap.empty[Char, HashSet[Int]];
		   world foreach( c => {
			   map = map + ( c -> HashSet.empty.+(  world.indexOf(c)))
		   })
		   map
   }

   println(indexes("ROBSON OLIVEIRA DUARTE"))
}

