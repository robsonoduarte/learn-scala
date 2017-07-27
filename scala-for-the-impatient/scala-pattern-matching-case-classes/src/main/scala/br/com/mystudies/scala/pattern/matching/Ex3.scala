package br.com.mystudies.scala.pattern.matching

object Ex3 extends App {


  def swap(x: List[Int]) = x  match {
    case _ if x.length > 2 => x reverse
    case _ => x
  }




  println(swap(List(3,4)))
  println(swap(List(3,4,5)))



}