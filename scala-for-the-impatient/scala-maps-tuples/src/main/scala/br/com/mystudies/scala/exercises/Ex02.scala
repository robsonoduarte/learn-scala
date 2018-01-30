package br.com.mystudies.scala.exercises

import scala.io.Source

/**
 * Write a program that reads words from a file. Use a mutable map to count how often each word appears.
 * To read the words, simply use a java.util.Scanner :
 * val in = new java.util.Scanner(new java.io.File("myfile.txt")) while (in.hasNext()) process in.next()
 *
 * Or look at Chapter 9 for a Scalaesque way. At the end, print out all words and their counts.
 */
object Ex02 extends App {

  val words = new collection.mutable.HashMap[String,Int]

  Source.fromFile("src/main/resources/words.txt").getLines()
    .foreach(word => {
     words(word) = words.getOrElse(word, 0) + 1
  })


  assert(words("java") == 2)
  assert(words("scala") == 2)
  assert(words("perl") == 1)
  assert(words("python") == 1)
  assert(words("groovy") == 1)
  assert(words("ruby") == 1)
  assert(words("go") == 2)

}