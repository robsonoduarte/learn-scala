package br.com.mystudies.scala.types



object UseDateUtil extends App {

}


object DateUitl{

  import java.time.LocalDate._


  implicit class DateHelper(offset: Int){
    def day(when:String){
     val today = now
       when match{
       case "ago" => today.minusDays(offset)
     }
    }
  }

}


