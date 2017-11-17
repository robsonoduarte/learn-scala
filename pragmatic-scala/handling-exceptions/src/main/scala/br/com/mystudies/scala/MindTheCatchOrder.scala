package br.com.mystudies.scala

object MindTheCatchOrder extends App {

  val amount = -2

  try {
    print(s"Amount: $$$amount ")
    println(s"Tax: $$${Tax.taxFor(amount)}")
  } catch {
    case ex: Exception => println("Something went wrong")
    case ex: IllegalArgumentException => println(ex.getMessage)
  }

  /*
   * Unlike java the the pattern matching uses for its catch blocks in the order in which present.
   *
   * Than the first case matches Exceptions and all of its subclass.
   */
}
