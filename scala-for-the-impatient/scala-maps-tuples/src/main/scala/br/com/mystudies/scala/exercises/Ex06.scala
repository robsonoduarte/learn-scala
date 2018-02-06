package br.com.mystudies.scala.exercises

import scala.collection.mutable.LinkedHashMap
import java.util.Calendar.{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}

/**
 * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY , and similarly for the other weekdays.
 * Demonstrate that the elements are visited in insertion order.
 */
object Ex06 extends App {
  

  val weekdays = LinkedHashMap(
      "Monday" -> MONDAY,  
      "Tuesday" ->  TUESDAY, 
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY, 
      "Sartuday" -> SATURDAY,
      "Sunday" -> SUNDAY 
     )
  
     assert( weekdays ==  (for( d <- weekdays ) yield d))
  
}

