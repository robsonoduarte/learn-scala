package br.com.mystudies.scala

object RegularExpressionsAsExtractor extends App {

  process("GOOG:310.84")
  process("IBM:84.01")
  process("GE:15.96")


  def process(input: String){
    val MatchSock = """^(.+):(\d*\.\d+)""".r
    input match{
      case MatchSock("GOOG", price) => println(s"We got GOOG at $$$price")
      case MatchSock("GOOG", price) => println(s"IBM's trading at $$$price")
      case MatchSock(symbol, price) => println(s"Price of $symbol $$$price")
      case _ => println(s"not processing $input")
    }
  }
}
