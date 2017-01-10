package br.com.mystudies.scala.currencies

object Currency extends Enumeration{
  type Currency = Value
  val CNY, GBP, INR, JPY, NOK, PLN, SEK, USD = Value
}