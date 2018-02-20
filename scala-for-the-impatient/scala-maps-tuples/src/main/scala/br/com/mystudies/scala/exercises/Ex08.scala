package br.com.mystudies.scala.exercises

object Ex08 extends App {
  
  
    def minMax(values: Array[Int]) = (values.min,values.max)
  
  
    assert(minMax(Array(10,2, 20, -1, 30)) == (-1,30) )  
}