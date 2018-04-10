package br.com.mystudies.scala

import java.util.Date

object PropertiesWithOnlyGetters extends App {
  
  val message = new Message
  
  //message.timeStamp = new Date don't compile no setter method
  
  print(message.timeStamp)
  
}

class Message{
  val timeStamp = new Date // read-only property
}


class Counter{
  private var value = 0
  def increment = {value += 1}
  def current = value
}

