package br.com.mystudies.scala.exercises

import scala.collection.mutable.ArrayBuffer

/**
 * How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
 * How do you do the same with an ArrayBuffer[Int] ?
 */
object Ex06 extends App {
   
   def reverseArraySorted(a: Array[Int]) =  a.reverse.sortWith(_>_) //(a,b) => a > b
   def reverseArraySorted(a:ArrayBuffer[Int]) = a.reverse.sortWith(_>_) //(a,b) => a > b

   assert(reverseArraySorted(Array(1,4,3,8,10)).deep == Array(10,8,4,3,1).deep)
   assert(reverseArraySorted(ArrayBuffer(1,4,3,8,10)) == ArrayBuffer(10,8,4,3,1))
}
