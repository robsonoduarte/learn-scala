package br.com.mystudies.scala

import scala.io.StdIn

object GettingUsersInput extends App {

  print("Please enter a ticker symbol:")
  val symbol = StdIn.readLine
  println(s"Ok, got it, you own $symbol")

}