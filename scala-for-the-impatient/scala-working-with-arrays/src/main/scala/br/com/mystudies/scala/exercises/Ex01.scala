package br.com.mystudies.scala.exercises

import scala.util.Random

/**
 * Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */
object Ex01 extends App {

  def randon(n:Int) = new Array[Int](n).map(_ => Random.nextInt(n))


  val array = randon(100)


  print(array.mkString(" "))
}
