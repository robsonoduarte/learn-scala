package br.com.mystudies.scala

import java.util.Currency
import br.com.mystudies.scala.investiment.Investiment
import br.com.mystudies.scala.investiment.InvestimentType

object UsingJavaClasseFromScala extends App {


   // using the class of standard JDK
   val currencies = Currency.getAvailableCurrencies
   println(s"${currencies.size} currencies are available" )


   // using the class not of standard JDK
   val investment = new Investiment("XYZ Corporation", InvestimentType.STOCK);
   println(investment.getClass)


   //investment.yield   --> compile error conflict with Scala Keywords

   // resolving the problem of compile error
   investment.`yield`

}