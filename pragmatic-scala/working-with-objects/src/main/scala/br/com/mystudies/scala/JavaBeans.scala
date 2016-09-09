package br.com.mystudies.scala

import scala.beans.BeanProperty

class Dude(val firstName: String, val lastName: String) {
   @BeanProperty var position : String = _

   override def toString = s"The Dude is $firstName $lastName  => $position"
}


object Run2 extends App  {

  val dude = new Dude("Robson", "Duarte")

  // additional javabeans set and get to position
  dude setPosition "Programmer"
  println(dude getPosition)
  println(dude)

}