package br.com.mystudies.scala.exercises

// Exercise 1 of chapter 2
object Ex1 extends App {

  def signum( n: Int ) = if (n > 0) 1 else if (n < 0) -1 else 0

  println(signum(10))
  println(signum(-10))
  println(signum(0))
}