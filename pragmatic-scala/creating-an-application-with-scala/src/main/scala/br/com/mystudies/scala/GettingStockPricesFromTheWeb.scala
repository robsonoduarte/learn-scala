

package br.com.mystudies.scala

import java.net.URLEncoder._
import java.time.LocalDate._
import java.time.format.DateTimeFormatter._
import java.util.Locale._
import java.lang.System._
import scala.io.Source
import scala.xml.XML


object GettingStockPricesFromTheWeb extends App {

  val symbolsAndUnits = StockLoader load

  println("Ticker Units Closing Price($) Total Value($)")

  val startTime = nanoTime


  // to see the difference time between when run in sequential mode and the parallel mode remove the comment.
  val valuesAndWorth = symbolsAndUnits.keys/*.par*/.map{ symbol =>
    val units = symbolsAndUnits(symbol)
    val latestClosingPrice = StockPriceFinder getLatestClosingPrice symbol
    val value = units * latestClosingPrice

    (symbol, units, latestClosingPrice, value)
  }

  val netWorth = (0.0 /: valuesAndWorth){ (worth, valueAndWorth) =>
    val (_,_,_, value) = valueAndWorth
    worth + value
  }

  val endTime = nanoTime

  valuesAndWorth.toList.sortBy{_._1}.foreach{ valueAndWorth =>
    val (symbol, units, lastesClosingPrice, value) = valueAndWorth
    println(f"$symbol%7s $units%5d $lastesClosingPrice%15.2f $value%.2f")
  }


  println(f"The total value of your investments is $$$netWorth%.2f")
  println(f"Took ${(endTime - startTime) / 1000000000.0}%.2f seconds")
}







object StockPriceFinder{
  def getLatestClosingPrice(symbol: String) ={
    val url = s"http://www.google.com/finance/historical?q=${symbol}&startdate=${yesterday}&output=csv"
    val data = Source.fromURL(url).mkString
    val closingPrice = data.split("\n")(1).split(",")(4).toDouble
    closingPrice
  }
  private def yesterday = encode(now.minusDays(1).format(ofPattern("MMM d, yyyy",US)))
}


object StockLoader{
  def load = {
    val stocksAndUnits = XML.loadFile("stocks.xml")
    ( Map[String,Int]() /: (stocksAndUnits \ "symbol") ){
      (map, symbolNode) =>
        val ticker = (symbolNode \ "@ticker").toString
        val units = (symbolNode \ "units").text.toInt
        map + (ticker -> units)
    }
  }
}


