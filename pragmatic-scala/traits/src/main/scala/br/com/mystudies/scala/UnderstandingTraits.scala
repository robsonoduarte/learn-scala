package br.com.mystudies.scala

object UnderstandingTraits extends App {
  val robson = new Man("Robson")
  val ana = new Woman("Ana")
  val preto = new Dog("Preto")


  robson.listen
  ana.listen
  preto.listen



  val manBestFriend:Friend = preto
  manBestFriend.listen

  def helpAsFriend(friend: Friend ) = friend.listen

  helpAsFriend(ana)
  helpAsFriend(preto)


}


trait Friend{
  val name: String
  def listen = println(s"Your friend $name is listening")
}


class Animal
class Human(val name: String ) extends Friend
class Man(override val name: String ) extends Human(name)
class Woman(override val name: String ) extends Human(name)
class Dog(val name: String) extends Animal with Friend{
  override def listen = println(s"$name's listening quietly")  // optionally override method here.
}



