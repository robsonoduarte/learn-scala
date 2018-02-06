package br.com.mystudies.scala.exercises

import scala.io.Source
import scala.collection.JavaConverters


/**
 * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 */
object Ex05 extends App {
  
   val words = new java.util.TreeMap[String,Int]
    
   Source.fromFile("src/main/resources/words.txt").getLines().foreach{ w => 
    words.put(w,  (words.getOrDefault(w, 0) + 1))
  }
  
 
}