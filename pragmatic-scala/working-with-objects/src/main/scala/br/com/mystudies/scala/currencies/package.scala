package br.com.mystudies.scala

package object currencies {

  import Currency._

  def convert(money: Money, to : Currency) = new Money(money.amount * 2, to)

}