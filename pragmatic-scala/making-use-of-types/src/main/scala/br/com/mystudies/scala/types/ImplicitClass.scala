package br.com.mystudies.scala.types



object UseDateUtil extends App {

  import DateUtil._

  println(2 days ago)
  println(2 days fromNow)
  println(2 days "")
}



object DateUtil{

	import java.time.LocalDate._

  val ago = "ago"
  val fromNow = "fromNow"

  // Scala does not require the implicitConversions import when implicit class are used
  implicit class DateHelper(offset: Int){
    def days(when:String) = {
     val today = now
      when match{
       case "ago" => today.minusDays(offset)
       case "fromNow" => today.plusDays(offset)
       case _ => today
     }
    }
  }
}


