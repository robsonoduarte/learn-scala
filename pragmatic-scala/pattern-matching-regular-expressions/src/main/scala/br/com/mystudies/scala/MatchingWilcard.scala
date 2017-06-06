package br.com.mystudies.scala


object MatchingWilcard extends App {

	import br.com.mystudies.scala.DayOfWeek._


  def activity(day: DayOfWeek.Value){
     day match {
      case SUNDAY => println("Eat, sleep, repeat...")
      case SATURDAY => println("Drink beer with friends")
      case _ => println("...code for fun...")
    }
  }


	activity(SATURDAY)
	activity(MONDAY)

}


object DayOfWeek extends Enumeration{
  type DayOfWeek = Value
  val SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY = Value
}

