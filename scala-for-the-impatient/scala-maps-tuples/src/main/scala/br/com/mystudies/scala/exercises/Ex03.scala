package br.com.mystudies.scala.exercises

import scala.io.Source
import scala.collection.immutable.HashMap

/**
 * Repeat the preceding exercise with an immutable map.
 */
object Ex03 extends App {

  var words = new HashMap[String,Int]
  
  
  Source.fromFile("src/main/resources/words.txt").getLines().foreach{ w => 
    words = words + ( w -> (words.getOrElse(w, 0) + 1))
  }
  
  
  assert(words("java") == 2)
  assert(words("scala") == 2)
  assert(words("perl") == 1)
  assert(words("python") == 1)
  assert(words("groovy") == 1)
  assert(words("ruby") == 1)
  assert(words("go") == 2)
  
  
}