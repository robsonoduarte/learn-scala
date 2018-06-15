package br.com.mystudies.scala.exercises

object Ex03 extends App {
  
  class Time( val hours:Int, val minutes:Int) {
  	def before(other: Time) = {
  		hours >= other.hours && minutes >= other.minutes
  	}
  }
  
}