package br.com.mystudies.scala

import scala.collection.Map

object CompanionObjects extends App {

  println(s"Supported colors are: ${Printer.supportedColors}")

  println(Printer("blue"))
  println(Printer("red"))
  println(Printer("black"))
  println(Printer("black"))

  println(s"Supported colors are: ${Printer.supportedColors}")
}



class Printer private (color: String) {
  println(s"Creating --> ${this}")
  override def toString = s"Printing the color --> $color"
}

object Printer {

  private val printers = Map(
    "red" -> new Printer("red"),
    "blue" -> new Printer("blue"),
    "yellow" -> new Printer("yellow"))

  def supportedColors = printers keys
  def apply(color: String) = printers getOrElse (color, new Printer(color))
}
