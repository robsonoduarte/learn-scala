package br.com.mystudies.scala

object Functions extends App {

  // to define one function, specify name, parameters and body:
  def abs(x: Double ) = if(x >= 0 ) x else -x


  println(abs(4))
  println(abs(-4))

}