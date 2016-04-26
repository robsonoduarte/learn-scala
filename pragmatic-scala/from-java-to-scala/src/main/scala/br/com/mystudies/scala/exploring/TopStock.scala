package br.com.mystudies.scala.exploring

object TopStock extends App {


  val simbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT");
  val year = 2014;



  val now = System nanoTime

  val (topStock, topPrice) =
      simbols map { ticker => (ticker, getYearEndClosingPrice(ticker, year)) } maxBy { stockPrice => stockPrice._2 }


  println( ( (System.nanoTime  -  now ) / 1000 ) / 1000)














  printf(s"Top stock of $year is $topStock closing at price $$$topPrice")






















  def getYearEndClosingPrice(symbol: String, year: Int) = {
    var url = s"http://ichart.finance.yahoo.com/table.csv?s=" + s"$symbol&a=11&b=01&c=$year&d=11&e31&f=$year&g=m"

    val data = io.Source.fromURL(url).mkString
    val price = data.split("\n")(1).split(",")(4).toDouble

    price
  }





}