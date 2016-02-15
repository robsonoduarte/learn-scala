 package br.com.mystudies.scala.collections

import scala.collection.immutable.Map
 import scala.collection.immutable.HashMap
 import scala.collection.immutable.HashSet



// Exercise 4
object Ex4 extends App {

  def func(list: List[String], map : Map[String, Int]) = {
       list flatMap(map get)
  }

  println(func(List("Tom", "Fred", "Robson"), Map( "Tom" -> 1, "Zica" -> 3, "Robson" -> 4)))

}

