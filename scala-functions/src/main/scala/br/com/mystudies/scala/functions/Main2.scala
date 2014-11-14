package br.com.mystudies.scala.functions

import scala.collection.immutable.Range
import scala.collection.mutable.LinkedList
import scala.collection.mutable.AbstractBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.HashMap

object Main2 extends App {

  
  def largest(x: Int, y: Int) :Int = { if( y > x) y else x } 
  
  
  println((1 to 50).reduceLeft(largest))
  print((1 to 8))
  
 
   
  println((0 to 2).reduceLeft((x: Int, y: Int) => (x) + (y)))
  
      //1 1 2 3 5 8 13 21...
  
 }