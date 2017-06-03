package br.com.mystudies.scala

object MatchingLiteralsAndConstants extends App {


  def activity(day: String){
    day match {
      case "Sunday" => println("Eat, sleep, repeat...")
      case "Saturday" => println("Hang out with friends...")
      case "Monday" => println("...code for fun...")
      case "Friday" => println("...read a good book...")
    }
  }


  List("Monday", "Sunday", "Saturday").foreach(activity)

}



