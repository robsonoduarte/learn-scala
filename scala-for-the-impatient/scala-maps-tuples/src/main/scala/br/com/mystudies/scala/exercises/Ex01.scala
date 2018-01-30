package br.com.mystudies.scala.exercises

/**
 * Set up a map of prices for a number of gizmos that you covet.
 * Then produce a second map with the same keys and the prices at a 10 percent discount.
 */
object Ex01 extends App {


  val gizmos =  Map( "pc" -> 20.0, "tv" -> 30.0 , "dvd" -> 10.0 , "cd" -> 5.0 )


  val discount = for((k,v) <- gizmos) yield (k, v * 0.9)


  assert( discount == Map( "pc" -> 18.0, "tv" -> 27.0 , "dvd" -> 9.0 , "cd" -> 4.5 ))


}