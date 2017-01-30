package br.com.mystudies.scala.types



object UseDateUtil extends App {

  import br.com.mystudies.scala.types.DateUitl._

  print(2 days ago)
  print(2 days fromNow)

}



object DateUitl{

  import java.time.LocalDate._

  val ago = "ago"
  val fromNow = "fromNow"

  implicit class DateHelper(offset: Int){
    def days(when:String){
     val today = now
      when match{
       case "ago" => today.minusDays(offset)
       case "frowNow" => today.plusDays(offset)
       case _ => today
     }
    }
  }


}


