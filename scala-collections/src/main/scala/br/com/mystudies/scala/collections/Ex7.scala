package br.com.mystudies.scala.collections

object Ex7 extends App {


  val prices = List(5.0, 20.0, 9.95 )
  val quantities = List( 10, 2, 1 )


   println( (prices zip quantities))
   println( (prices zip quantities) map {p => p._1 * p._2})
   println( ((prices zip quantities) map {p => p._1 * p._2}) sum)



   // http://daily-scala.blogspot.com.br/2009/11/function.html

   def twoParamFunc ( x: Double, y: Double )  = x * y

   val tuple = Function tupled twoParamFunc _

   print ( tuple (1.0 -> 2.0))



//   println( ((prices zip quantities) map {tuple _}) )




}