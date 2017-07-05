package br.com.mystudies.scala

import scala.io.Source
import scala.xml._

object ParallelCollections extends App {


  def getWeatherData(city: String ) = {
    val url = "http://api.openweathermap.org/data/2.5/weather"

    val response = Source.fromURL(s"$url?q=$city&units=imperial&mode=xml&APPID=863979fd70e0b430fa19554cc22118fc")
    val xmlResponse = XML.loadString(response.mkString)

    val cityName = (xmlResponse \\ "city" \ "@name").text
    val temperature = (xmlResponse \\ "temperature" \ "@value").text
    val condition = (xmlResponse \\ "weather" \ "@value").text

    (cityName, temperature, condition)

  }





}