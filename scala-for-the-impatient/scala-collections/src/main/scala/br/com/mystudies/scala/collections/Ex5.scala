 package br.com.mystudies.scala.collections

import scala.collection.immutable.Map
 import scala.collection.immutable.HashMap
 import scala.collection.immutable.HashSet



// Exercise 5
object Ex5 extends App {


   def mkString(list: List[String]) = {
      list.reduceLeft(_+_)
   }


   println(mkString( List("Tom", "Fred", "Robson")))
   println(List("Tom", "Fred", "Robson").mkString)

}

