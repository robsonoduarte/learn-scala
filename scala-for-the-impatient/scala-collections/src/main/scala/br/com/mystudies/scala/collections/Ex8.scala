package br.com.mystudies.scala.collections

object Ex8 extends App {

  def func( a: Array[Int], columns : Int) = {
     a grouped(columns) toArray
  }


  var a = Array(1,2,3,4)


  func(a, 2)

}