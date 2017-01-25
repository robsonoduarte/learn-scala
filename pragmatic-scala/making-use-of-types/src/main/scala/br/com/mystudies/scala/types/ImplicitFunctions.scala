package br.com.mystudies.scala.types


class DateHelper(offset:Int){

  import scala.language.implicitConversions
  import java.time.LocalDate._

  def days(when: String) ={
    val today = now
    when match {
      case "ago" => today.minusDays(offset)
      case "fromNow" => today.plusDays(offset)
      case _ => today
    }
  }
}


object DateHelper{
  val ago = "ago"
  val fromNow = "fromNow"
  implicit def converInt2DateHelper(offset: Int) = new DateHelper(offset)
}




object DaysDSL extends App {

  import DateHelper._

   println(2 days ago)
   println(2 days fromNow)
   println(2 days "")

}
