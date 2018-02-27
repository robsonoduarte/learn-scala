package br.com.mystudies.scala.exercises

class Time( val hours:Int, val minutes:Int, val seconds: Int = 0) {

	def before(other: Time) = {
		hours >= other.hours && minutes >= other.minutes && seconds > other.seconds
	}
}