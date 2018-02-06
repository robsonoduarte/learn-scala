package br.com.mystudies.scala.exercises

import scala.collection.SortedMap
import scala.io.Source

/**
 * Repeat the preceding exercise with a sorted map, so that the words are
 * printed in sorted order.
 */

object Ex04 extends App {
  
  var words = SortedMap[String,Int]()
  
   Source.fromFile("src/main/resources/words.txt").getLines().foreach{ w => 
    words = words + ( w -> (words.getOrElse(w, 0) + 1))
  }
  
  words.foreach(println)
}