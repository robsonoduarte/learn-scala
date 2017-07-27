package br.com.mystudies.scala

import scala.xml.XML

object ReadingAndWritingXML extends App {


  val stocksAndUnits = XML load "stocks.xml"

  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")



}