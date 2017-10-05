package br.com.mystudies.scala

object Exceptions extends App {


  // like java we can throw one Exception
  def sqrt(x: Int) = {
    if(x>=0) Math.sqrt(x)
    else throw new Exception("x should not be negative")
  }



  // but in Scala has no checked exceptions
  println(sqrt(4))
  println(sqrt(-4))




}