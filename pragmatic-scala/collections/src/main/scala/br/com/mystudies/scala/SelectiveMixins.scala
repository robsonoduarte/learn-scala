package br.com.mystudies.scala

object SelectiveMixins extends App {

  def userFriend(friend: Friend) = friend.listen


  val alf = new Cat("Alf")

  //val friend: Friend = alf  ->>> compilation error cat is not one Friend
  //userFriend(alf) ---> the same problem


  // however Scala allows that we mix one instance with one trait

  val angel = new Cat("Angel") with Friend
  val friend : Friend = angel
  angel.listen

  userFriend(angel)

}

class Cat(val name: String) extends Animal




