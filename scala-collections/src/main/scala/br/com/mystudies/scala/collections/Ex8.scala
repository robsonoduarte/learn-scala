package br.com.mystudies.scala.collections

object Ex8 extends App {




  def func( a: Array[Int], coluns : Int) = {
     a grouped(coluns)
  }







  func(Array(1,2,3), 2).foreach { x => x.foreach(println _)}



}