package br.com.mystudies.scala.collections

object Ex7 extends App {


  val prices = List(5.0, 20.0, 9.95 )
  val quantities = List( 10, 2, 1 )


   println( (prices zip quantities))
   println( (prices zip quantities) map {p => p._1 * p._2})
   println( ((prices zip quantities) map {p => p._1 * p._2}) sum)



  //  var f = new Function2[]
   // http://stackoverflow.com/questions/2354277/function-tupled-and-placeholder-syntax


}