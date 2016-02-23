package br.com.mystudies.scala.collections

object Ex7 extends App {


  val prices = List(5.0, 20.0, 9.95 )
  val quantities = List( 10, 2, 1 )


   println( (prices zip quantities))
   println( (prices zip quantities) map {p => p._1 * p._2})
   println( ((prices zip quantities) map {p => p._1 * p._2}) sum)





   //using te tupled to take the tuple and return o function one parameter
   println( ((prices zip quantities) map {Function.tupled(_*_)}) )


   // unsing the zipped method and map of Tuple2Zipped than your map take on tuple
   println((prices,quantities).zipped map (_*_))



}