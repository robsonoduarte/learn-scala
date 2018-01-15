package br.com.mystudies.scala

object DefaultAndNamedArguments extends App {


  // provide defaults arguments
  def decorate(str: String, left: String = "[", rigth: String = "]") = left + str + rigth


  // using the default values
  println(decorate("Hello"))

  // supply defaults arguments
  println(decorate("Hello", "<<<", ">>>"))


  // supply fewer arguments
  println(decorate("Hello", ">>>["))


  // specify the parameter names when supply the arguments
  println(decorate(left = "<<<", str = "Hello", rigth = ">>>"))


  // mix unnamed and named arguments
  println(decorate("Hello", rigth = "]<<<"))
}
