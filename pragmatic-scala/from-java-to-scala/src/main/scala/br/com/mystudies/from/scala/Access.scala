package br.com.mystudies.from.scala

object Access extends App {

  val microwave = new Microwave

  microwave.start
  microwave.stop
  //microwave.turnTable // don't compile
}



class Microwave{
  // by default methods is plubic
  def start = println("started")
  def stop = println("stopped")

  // to change access, explicitly the modifiers
  private def turnTable  = println("turning table")
}
