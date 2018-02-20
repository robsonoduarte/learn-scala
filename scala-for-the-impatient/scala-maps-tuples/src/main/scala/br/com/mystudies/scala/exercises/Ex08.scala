package br.com.mystudies.scala.exercises

/**
 * Write a function minmax(values: Array[Int]) that returns a pair containing
 * the smallest and largest values in the array.
 */
object Ex08 extends App {
  
  
    def minmax(a: Array[Int]) = (a.min,a.max)
  
  
    assert(minmax(Array(10,2, 20, -1, 30)) == (-1,30) )  
}