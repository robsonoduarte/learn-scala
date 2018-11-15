package br.com.mystudies.scala

import scala.actors.Actor
import scala.actors.Actor._

object CreatingAndStartingActors extends App {


  // extending the Trait Actor to create on Actor
  class HiActor extends Actor{
    def act = {
      while(true){
        receive{
          case "Hi" => println("Hello")
        }
      }
    }
  }

  val actor1 = new HiActor
  actor1.start


  // Using the actor method of Actor companion object to create and start
  val actor2 = actor{
    while(true){
      receive{
        case "Hi" => println("Hello")
      }
    }
  }

}