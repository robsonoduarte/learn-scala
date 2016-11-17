package br.com.mystudies.scala.currencies

import Currency._


object Convert {

  def convert(money: Money, to : Currency) = new Money(money.amount * 2, to)

}