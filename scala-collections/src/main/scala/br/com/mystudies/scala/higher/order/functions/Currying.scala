package br.com.mystudies.scala.higher.order.functions

object Currying extends App {

  def mul (x: Int, y: Int) = x * y

  def mulOneAlTime(x: Int) = (y: Int) => x * y

  println(mulOneAlTime(6)(7))

  // TODO: go back this item after of make exercises

}
