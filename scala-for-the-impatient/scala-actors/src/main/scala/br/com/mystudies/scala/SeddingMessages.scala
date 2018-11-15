package br.com.mystudies.scala

import scala.actors.Actor._

object SeddingMessages extends App {

  val a = actor{
    while(true){
      receive{
        case "Hi" => println("Hello")
      }
    }
  }

  // using the operator ! to sending one message
  a ! "Hi"

}