 package br.com.mystudies.scala.collections

import scala.collection.immutable.Map
 import scala.collection.immutable.HashMap
 import scala.collection.immutable.HashSet



// Exercise 3
object Ex3 extends App {


   def removeZeros(list : List[Int] ) = {
       list filterNot(_ == 0)
   }


   println(removeZeros(List(1, 2, 0, 3, 0)))


}

