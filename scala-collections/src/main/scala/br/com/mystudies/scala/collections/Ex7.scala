package br.com.mystudies.scala.collections

object Ex7 extends App {


  val prices = List(5.0, 20.0, 9.95 )
  val quantities = List( 10, 2, 1 )


   println( (prices zip quantities))
   println( (prices zip quantities) map {p => p._1 * p._2})
   println( ((prices zip quantities) map {p => p._1 * p._2}) sum)


   
   // http://daily-scala.blogspot.com.br/2009/11/function.html

   def twoParamFunc ( x: Int, y: Int )  = print ( x, y )  

   val tuple = Function tupled twoParamFunc _
   
   print ( tuple (1 -> 1))


}