package br.com.mystudies.scala

import akka.actor._
import akka.pattern.ask
import akka.util.Timeout
import scala.collection.mutable._
import scala.concurrent.duration._
import scala.concurrent.Await

object IsolatedMutability extends App {

  val system = ActorSystem("sample")

  val depp = system.actorOf(Props[HollywoodActor2])
  val hanks = system.actorOf(Props[HollywoodActor2])



  depp ! Play("Wonka")
  hanks ! Play("Gump")

  depp ! Play("Wonka")
  depp ! Play("Sparrow")


  println("Sent roles to play")


  implicit val timeout = Timeout(2.seconds)


  val wonkaFuture = depp ? ReportCount("Wonka")
  val sparrowFuture = depp ? ReportCount("Sparrow")
  val gumpFuture = hanks ? ReportCount("Gump")


  val wonkaCount = Await.result(wonkaFuture, timeout.duration)
  val sparrowCount = Await.result(sparrowFuture, timeout.duration)
  val gumpCount = Await.result(gumpFuture, timeout.duration)



  println(s"Deep played Wonka $wonkaCount time(s)")
  println(s"Deep played Sparrow $sparrowCount time(s)")
  println(s"Deep played Gump $gumpCount time(s)")

  system.terminate()


}






case class Play(role: String)
case class ReportCount(role: String)

class HollywoodActor2 extends Actor{

  val messagesCount : Map[String,Int] = Map()


  def receive ={
    case Play(role) =>
      val currentCount = messagesCount getOrElse(role, 0)
      messagesCount.update(role, currentCount + 1)
      println(s"Playing $role")

    case ReportCount(role) =>
      sender ! messagesCount.getOrElse(role, 0)
  }

}