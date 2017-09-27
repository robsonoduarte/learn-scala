package br.com.mystudies.scala

object Functions extends App {

  // to define one function, specify name, parameters and body:
  def abs(x: Double ) = if(x >= 0 ) x else -x


  // using o block when function requires more than one expression
  def fac(n: Int) = {
    var r = 1
    for(i <- 1 to n ) r = r * i
    r
  }




  println(abs(4))
  println(abs(-4))
  println(fac(4))

}