package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object CommonsAlgorithms extends App {

  // sum elements

  val sum = Array( 1, 7, 2, 9).sum
  println(sum)


  // get max element
  val max = ArrayBuffer("Mary", "had", "a", "little", "lamb").max
  println(max)


  // sorts a array without modifying the original
  val ab = ArrayBuffer(1,7,2,9)
  val sorted = ab.sortWith(_ < _)

  println(ab)
  println(sorted)


  // use the scala.util
  val a = Array(1,7,2,9)
  Sorting.quickSort(a)


  //display the contents
  println(a.mkString(" and "))
  println(a.mkString("<", ",", ">"))


  
}