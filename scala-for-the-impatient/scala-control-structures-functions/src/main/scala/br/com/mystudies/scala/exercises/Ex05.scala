package br.com.mystudies.scala.exercises

/**
 * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
 */
object Ex05 extends App {

  def countdown(n: Int) { for (x <- 0 to n reverse) print(x + " ") }

  countdown(10)

}