package br.com.mystudies.scala

object MatchingUsingCaseClasses extends App {

  // using the case class that took parameters
  TradeProcessor processTransaction Sell("GOOG", 500)
  TradeProcessor processTransaction Buy("GOOG", 700)
  TradeProcessor processTransaction Sell("GOOG", 1000)
  TradeProcessor processTransaction Buy("GOOG", 3000)


  // no parameter in case class
  ThingsAcceptor acceptStuff Apple()
  ThingsAcceptor acceptStuff Book()
  ThingsAcceptor acceptStuff Apple // Scala will sending the companion object mixed in the scala.Function0
  //ThingsAcceptor acceptStuff2 Apple // now compile ensures that we send only instances of Thing



}


object TradeProcessor{
  def processTransaction(request: Trade){
    request match {
      case Sell(stock,1000) => println(s"Selling 1000-units of $stock")
      case Sell(stock,quantity) => println(s"Selling $quantity units of $stock")
      case Buy(stock,quantity) if (quantity > 2000) => println(s"Buying $quantity (large) units of $stock")
      case Buy(stock,quantity)=> println(s"Buying $quantity (large) units of $stock")
    }
  }
}



object ThingsAcceptor{
  def acceptStuff(thing: Any){
    thing match{
      case Apple() => println("Thanks for the Apple")
      case Orange() => println("Thanks for the Orange")
      case Book() => println("Thanks for the Book")
      case _ => println(s"Excuse me, why did you send me $thing")
    }
  }

  def acceptStuff2(thing: Thing){
    thing match{
      case Apple() => println("Thanks for the Apple")
      case Orange() => println("Thanks for the Orange")
      case Book() => println("Thanks for the Book")
      case _ => println(s"Excuse me, why did you send me $thing")
    }
  }
}



// case class with parameters
trait Trade
case class Sell(stockSymbol: String, quantity: Int) extends Trade
case class Buy(stockSymbol: String, quantity: Int) extends Trade
case class Hedge(stockSymbol: String, quantity: Int) extends Trade



// case class no parameters
abstract class Thing
case class Apple() extends Thing
case class Orange() extends Thing
case class Book() extends Thing
