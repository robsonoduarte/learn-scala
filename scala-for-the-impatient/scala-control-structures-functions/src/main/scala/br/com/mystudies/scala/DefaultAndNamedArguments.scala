package br.com.mystudies.scala

object DefaultAndNamedArguments extends App {


  // provide defaults arguments
  def decorate(str: String, left: String = "[", rigth: String = "]") = left + str + rigth


  // using the default values
  println(decorate("Hello"))

  // supply defaults arguments

  println(decorate("Hello", "<<<", ">>>"))


}