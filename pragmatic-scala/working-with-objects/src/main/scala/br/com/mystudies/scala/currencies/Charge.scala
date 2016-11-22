package br.com.mystudies.scala.currencies

import Currency._

object Charge {

  def chargeInUSD(money: Money) = {
    def moneyInUSD = Convert.convert(money, USD)
    s"charged $$${money.amount}"
  }


}