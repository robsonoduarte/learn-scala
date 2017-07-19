package br.com.mystudies.scala

import java.util.Currency

object UsingJavaClasseFromScala extends App {


   // using the class of standard JDK
   val currencies = Currency.getAvailableCurrencies
   println(s"${currencies.size} currencies are available" )


}