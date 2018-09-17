package br.com.mystudies.scala.exercises

/**
 * Write a class Time with read-only properties hours and minutes and a method before(other: Time):
 * Boolean that checks whether this time comes before the other.
 *
 * A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
 */
object Ex03 extends App {

	class Time( val hours:Int, val minutes:Int) {
		def before(other: Time) = {
				hours < other.hours || ( hours == other.hours &&  minutes < other.minutes)
		}
	}


  val t1 = new Time(20,50)
  val t2 = new Time(20,49)

  assert( t2.before(t1) == true)


}