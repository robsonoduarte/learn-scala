package br.com.mystudies.scala.currencies

import Currency._

object CurrencyApp extends App{

  val money = new Money(10, GBP)

  println(Charge.chargeInUSD(money))
  println(/*Convert.*/convert(money, USD)) // <-- using the package object

}