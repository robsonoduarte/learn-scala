package br.com.mystudies.scala

import scala.collection.Map

object Singleton extends App {

  println("#### MAKER BY MAKERFACTORY ####")
  println(MarkerFactory getMaker "red")
  println(MarkerFactory getMaker "red")
  println(MarkerFactory getMaker "blue")
  println(MarkerFactory getMaker "blue")
  println(MarkerFactory getMaker "green")
  println()

  println("#### MAKER BY COMPANION OBJECT ####")
  println(Marker getMaker "red")
  println(Marker getMaker "red")
  println(Marker getMaker "blue")
  println(Marker getMaker "blue")
  println(Marker getMaker "green")

}

class Marker(color: String) {
  println(s"Creating --> ${this}")
  override def toString = s"marker color $color"
}

object MarkerFactory {

  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"))

  def getMaker(color: String) = markers getOrElse (color, new Marker(color))
}

object Marker {

  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"))

  def getMaker(color: String) = markers getOrElse (color, new Marker(color))
}
