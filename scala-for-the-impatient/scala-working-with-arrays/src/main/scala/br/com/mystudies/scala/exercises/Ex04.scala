package br.com.mystudies.scala.exercises

/**
 * Given an array of integers, produce a new array that contains all positive values of the original array,
 * in their original order, followed by all values that are zero or negative, in their original order.
 */
object Ex04 extends App {

  def sortPositive(a:Array[Int]) = a.filter(_ > 0) ++ a.filter(_ <= 0)

  print(sortPositive(Array(-2,3,-4,0,1,-5)).deep == Array(3,1,-2,-4,0,-5).deep)

}