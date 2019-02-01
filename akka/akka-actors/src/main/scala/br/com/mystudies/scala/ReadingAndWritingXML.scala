package br.com.mystudies.scala

import scala.xml.XML

object ReadingAndWritingXML extends App {

  // read xml
  val stocksAndUnits = XML load "stocks.xml"

  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")

  // map the xml in new map(ticker -> units)
  val stocksAndUnitMap =
   ( Map[String,Int]() /: (stocksAndUnits \ "symbol" )) { (map,symbolNode) =>
     val ticker = (symbolNode \ "@ticker").toString()
     val units = (symbolNode \ "units").text.toInt
     map + (ticker -> units)
  }

  println(stocksAndUnitMap)
  println(s"Number of symbol elements found is ${stocksAndUnitMap.size}")


  // update and write the xml
  val updatedStocksAndUnitsXML =
    <symbols>
	{stocksAndUnitMap map updateUnitsAndCreateXML}
    </symbols>

  def updateUnitsAndCreateXML(element: (String, Int))= {
    val (ticker,units) = element
    <symbol ticker={ticker}>
	<units>{units + 1}</units>
    </symbol>
  }

  // save the new xml
  XML save("stock2.xml", updatedStocksAndUnitsXML )

  val elementsCount = (XML.load("stock2.xml") \\ "symbol").size
  println(s"Saved file has ${elementsCount} symbol elements")

}
