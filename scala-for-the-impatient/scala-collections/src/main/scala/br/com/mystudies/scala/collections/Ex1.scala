package br.com.mystudies.scala.collections



import scala.collection.mutable.HashSet
import scala.collection.mutable.HashMap
import scala.App


// Exercises 1
object Ex1 extends App {


  def indexes(world : String ) = {
     var map =  HashMap.empty[Char, HashSet[Int]];
     world foreach( c => {
        map getOrElseUpdate(c, new HashSet) += world.indexOf(c)
     })
     map
  }

   print(indexes("ROBSON OLIVEIRA DUARTE"))

}

