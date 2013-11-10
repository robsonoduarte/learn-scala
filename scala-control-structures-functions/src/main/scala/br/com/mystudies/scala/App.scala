package br.com.mystudies.scala



object App {

  def signum( n: Int ) = { if (n > 0) 1 else if (n < 0) -1 else 0 }

  def unit() = {}

  def loop() = {for(i <- 1 to 10){print(i)} }

  def countdown(n: Int) { for (x <- 0 to n reverse) print(x + " ") }

  def main(args : Array[String]) {
    println( signum(10) )
    println( signum(-10) )
    println( signum(0) )
    println( unit() )
    loop()
    countdown(30)
  }

}
