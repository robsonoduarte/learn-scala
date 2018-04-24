package br.com.mystudies.scala

import java.util.Date

object PropertiesWithOnlyGetters extends App {
  
  val message = new Message
  
  //message.timeStamp = new Date don't compile no setter method
  
  println(message.timeStamp)
  
  val counter = new Counter2
  
  counter.increment
  
  println(counter.current)
  
}

class Message{
  val timeStamp = new Date // read-only property
}

// provide a private field and a property getter
class Counter2{
  private var value = 0
  def increment = {value += 1}
  def current = value
}

