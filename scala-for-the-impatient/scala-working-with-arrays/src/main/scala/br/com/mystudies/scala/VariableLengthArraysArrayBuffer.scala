package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

object VariableLengthArraysArrayBuffer extends App {



  // AN EMPTY ARRAY BUFFER , READY TO HOLD INTEGERS
  val b = ArrayBuffer[Int]() // or new Array[Int]


  // ADD ELEMENT
  b += 1 //ArrayBuffer(1)

  // ADD MULTIPLE ELEMENTS
  b += (1,2,3,5) //ArrayBuffer(1, 1, 2, 3, 5)

  // APPEND ANY COLLECTION
  b++= Array(8, 13, 21) //ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
  b++= List(30, 40) //ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21, 30, 40)



  //REMOVE THE LAST FIVE ELEMENTS
  b.trimEnd(5) //ArrayBuffer(1, 1, 2, 3, 5)







}