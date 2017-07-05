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



  def printWeatherData(weatherData: (String, String, String))={
    val (city,temperature,condition) = weatherData
    println(f"$city%-15s $temperature-6s $condition")
  }






  def timeSample(getData: List[String] => List[(String, String, String)]) = {
    val cities = List("Houston,us", "Chicago,us", "Boston,us", "Minneapolis,us", "Oslo,norway",
          "Tromso,norway", "Sydney,australia", "Berlin,gernany", "London,uk", "Krakow,poland",
          "Rome,italy", "Stockholm,sweden", "Bangalore,india", "Brussels,belgium", "Reykjavik,iceland"
        )

      val start = System.nanoTime
      getData(cities).sortBy(_._1).foreach(printWeatherData)
      val end = System.nanoTime
      println(s"Time taken: ${(end - start) / 1.0e9} sec")
  }




    // full syntax of line above
/*  timeSample( (cities: List[String]) => cities.map(city => getWeatherData(city)))
    timeSample( (cities: List[String]) => cities.map(getWeatherData(_)))*/

  // Run in sequential mode in syntax simplified
  timeSample { cities => cities map getWeatherData }
















}