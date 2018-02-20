package br.com.mystudies.scala.exercises

object Ex09 extends App {
  
  
  def lteggt(values: Array[Int], v:Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  
  
  assert(lteggt(Array(10,-3,22, 13, 1, 5, 9 , -1), 1) == (2, 1, 5))
  
}