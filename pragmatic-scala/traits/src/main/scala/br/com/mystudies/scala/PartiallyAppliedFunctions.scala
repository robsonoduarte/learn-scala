

package br.com.mystudies.scala

import java.util.Date

object PartiallyAppliedFunctions extends App {

  def log(date:Date, message: String) = {
    println(s"$date ---- $message")
  }

  val date = new Date()
  log(date, "message1")
  log(date, "message2")
  log(date, "message3")


  val logWithDateBound = log(date, _:String)
  logWithDateBound("message 1")
  logWithDateBound("message 2")
  logWithDateBound("message 3")
}
