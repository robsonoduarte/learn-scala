package br.com.mystudies.scala.exercises



object App {



  def countdown(n: Int) { for (x <- 0 to n reverse) print(x + " ") }

  def main(args : Array[String]) {
    countdown(30)
  }

}
