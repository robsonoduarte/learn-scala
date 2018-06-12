package br.com.mystudies.scala

object ObjectPrivateFields extends App {
  val counter = new Counter
  
  class Counter{
    private[this] var value = 0 // only the methods of the class can access     
    print(value)
  }
  
}
