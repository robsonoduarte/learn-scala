package br.com.mystudies.scala

import scala.actors.Actor._

object ReceivingMessages extends App {

  case class Deposit(amount: Double)
  case class Withdraw(amount: Double)

  val acount = actor{
      var balance = 0.0
      while(true){
        receive{
          case Deposit(amount) => balance += amount
          case Withdraw(amount) => balance -= amount
        }
        println(balance)
      }
  }

  acount ! Deposit(20.0)
  acount ! Withdraw(10.0)
  acount ! "No corret message"
  acount ! Deposit(10.0)

}