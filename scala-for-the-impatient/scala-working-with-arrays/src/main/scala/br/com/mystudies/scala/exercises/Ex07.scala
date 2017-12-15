package br.com.mystudies.scala.exercises

/**
 * Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)
 */

object Ex07 extends App {


  def removeDuplicates(a: Array[Int]) = a distinct


  assert(removeDuplicates(Array(1,1,2,2,3,3,4,4)).deep == Array(1,2,3,4).deep)

}