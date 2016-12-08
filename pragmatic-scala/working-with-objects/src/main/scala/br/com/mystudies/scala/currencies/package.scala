package br.com.mystudies.scala

package object currencies {

  import Currency._

  def convert(money: Money, to : Currency) = new Money(money.amount * 2, to)

}




/*
  Compiled from "package.scala"
  public final class br.com.mystudies.scala.currencies.package {
  public static br.com.mystudies.scala.currencies.Money convert(br.com.mystudies.scala.currencies.Money, scala.Enumeration$Value);

*/