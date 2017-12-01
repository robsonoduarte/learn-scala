package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

object VariableLengthArraysArrayBuffer extends App {



  // AN EMPTY ARRAY BUFFER , READY TO HOLD INTEGERS
  val b = ArrayBuffer[Int]() // or new Array[Int]


  // ADD ELEMENT
  b += 1 // => ArrayBuffer(1)

  // ADD MULTIPLE ELEMENTS
  b += (1,2,3,5) // => ArrayBuffer(1, 1, 2, 3, 5)

  // APPEND ANY COLLECTION
  b++= Array(8, 13, 21) // => ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
  b++= List(30, 40) // => ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21, 30, 40)



  //REMOVE THE LAST FIVE ELEMENTS
  b trimEnd 5 // => ArrayBuffer(1, 1, 2, 3, 5)


  // INSERT BEFORE INDEX 2
  b insert(2, 6) // => ArrayBuffer(1, 1, 6, 2, 3, 5)

  // INSERT MANY ELEMENTS
  b insert(2, 7, 8, 9) // => ArrayBuffer(1, 1, 7, 8, 9, 6, 2, 3, 5)


  // REMOVE
  b remove 2 // => ArrayBuffer(1, 1, 8, 9, 6, 2, 3, 5)


  // REMOVE MANY ELEMENTS
  b remove(2, 3) // => ArrayBuffer(1, 1, 2, 3, 5)
}