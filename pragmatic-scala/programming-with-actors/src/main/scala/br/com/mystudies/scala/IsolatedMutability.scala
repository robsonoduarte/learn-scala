package br.com.mystudies.scala

import akka.actor.Actor
import scala.collection.mutable._

object IsolatedMutability extends App {

}


case class Play(role: String)
case class ReportCount(role: String)

class HollywoodActor2 extends Actor{

  val messagesCount : Map[String,Int] = Map()


  def receive ={
    case Play(role) =>
      val currentCount = messagesCount getOrElse(role, 0)
      messagesCount.updated(role, currentCount + 1)
      println(s"Playing $role")

    case ReportCount(role) =>
      sender ! messagesCount.getOrElse(role, 0)
  }

}