package br.com.mystudies.scala.exercises



object App {

  def unit() = {}

  def loop() = {for(i <- 1 to 10){print(i)} }

  def countdown(n: Int) { for (x <- 0 to n reverse) print(x + " ") }

  def main(args : Array[String]) {
    println( unit() )
    loop()
    countdown(30)
  }

}
