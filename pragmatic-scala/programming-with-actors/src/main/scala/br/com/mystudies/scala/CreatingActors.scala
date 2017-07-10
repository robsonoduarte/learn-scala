package br.com.mystudies.scala

import akka.actor.Actor



object CreatingActors extends App {


}


class HollywoodActor extends Actor {

  def receive = {
    case message => println(s"playing the role of $message")
  }

}