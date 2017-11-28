package br.com.mystudies.scala.exercises

/**
 * What is the value of an empty block expression {} ? What is its type?
 */
object Ex2 extends App {

   def unit() = {}

   //Unit has only one value which is ()
   println(unit)

    //His type is Unit
   println(unit.isInstanceOf[Unit])

}