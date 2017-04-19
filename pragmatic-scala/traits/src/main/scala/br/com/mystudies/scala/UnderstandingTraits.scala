package br.com.mystudies.scala

object UnderstandingTraits extends App {
}

class Human(val name: String ){
  def listen = println(s"Your  friend $name is listening")
}


class Man(override val name: String ) extends Human(name)
class Woman(override val name: String ) extends Human(name)



