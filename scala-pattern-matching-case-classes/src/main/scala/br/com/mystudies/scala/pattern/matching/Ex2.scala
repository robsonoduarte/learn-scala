package br.com.mystudies.scala.pattern.matching


object Ex2 extends App {


  def swap (x: Int, y: Int) = x match {
    case 1 => (x,y)
    case 2 => (y,x)
    case _ => ()
  }



  println(swap(1, 3))
  println(swap(2, 3))
  println(swap(4, 3))



}