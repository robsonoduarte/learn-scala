package br.com.mystudies.scala.exercises

import scala.io.Source
import scala.collection.JavaConversions.mapAsScalaMap


/**
 * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 */
object Ex05 extends App {
  
  
  
   val words =  new java.util.TreeMap[String,Int]()
    
   Source.fromFile("src/main/resources/words.txt").getLines().foreach{ w => 
    words(w) = (words.getOrElse(w, 0) + 1)
  }
 
  
   
  assert(words("java") == 2)
  assert(words("scala") == 2)
  assert(words("perl") == 1)
  assert(words("python") == 1)
  assert(words("groovy") == 1)
  assert(words("ruby") == 1)
  assert(words("go") == 2)
 
   
}