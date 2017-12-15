package br.com.mystudies.scala.exercises

/**
 * How do you compute the average of an Array[Double] ?
*/
object Ex05 extends App {

  def average(x: Array[Double])= x.sum / x.length

  print( average(Array(1.0,2.0,3.0,4.0,5.0)) == 3)


}