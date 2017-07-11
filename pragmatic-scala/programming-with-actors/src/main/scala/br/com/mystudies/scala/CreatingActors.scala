package br.com.mystudies.scala

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props



object CreatingActors extends App {

  val system = ActorSystem("sample")

  val depp = system.actorOf(Props[HollywoodActor])

  depp ! "Wonka"

  system terminate
}



class HollywoodActor extends Actor {

  def receive = {
    case message => println(s"playing the role of $message")
  }

}