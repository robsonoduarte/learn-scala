package br.com.mystudies.scala.pattern.matching


object Ex2 extends App {


  def swap (x: (Int,Int)) = x match {
    case x : (Int,Int) => x swap
    case _ => ()
  }



  println(swap(1, 3))
  println(swap(null))



}