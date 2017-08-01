package br.com.mystudies.scala

import scala.xml.XML

object ReadingAndWritingXML extends App {


  val stocksAndUnits = XML load "stocks.xml"

  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")


  val stocksAndUnitMap =
   ( Map[String,Int]() /: (stocksAndUnits \ "symbol" )) { (map,symbolNode) =>
     val ticker = (symbolNode \ "@ticker").toString()
     val units = (symbolNode \ "units").text.toInt
     map + (ticker -> units)
  }

  println(stocksAndUnitMap)
  println(s"Number of symbol elements found is ${stocksAndUnitMap.size}")



}