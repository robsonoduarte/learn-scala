package br.com.mystudies.scala

object Functions extends App {

  // to define one function, specify name, parameters and body:
  def abs(x: Double ) = if(x >= 0 ) x else -x

  // using o block when function requires more than one expression
  def fac1(n: Int) = {
    var r = 1
    for(i <- 1 to n ) r = r * i
    r
  }

  // with recursive function, must specify the return type:

  def fac2(n: Int): Int = if(n <= 0) 1 else n * fac2(n -1)

  println(abs(4))
  println(abs(-4))
  println(fac1(4))
  println(fac2(4))
}
