package br.com.mystudies.scala

import br.com.mystudies.scala.currencies.Money





object UseCurrency extends App {

	import br.com.mystudies.scala.currencies.Currency._

  val money = new Money(10, CNY)

	println(money)


	import br.com.mystudies.scala.currencies.Currency

	Currency.values foreach println

}





