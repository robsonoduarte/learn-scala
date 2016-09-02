package br.com.mystudies.scala

class Construct(param:String) {
  println(s"Creating an instance of Construct with parameter $param")
}


class Person(val firstName: String, val lastName: String){
  var position: String = _
  println(s"Creating ${toString}")

  def this (firstName: String,lastName:String,positionHeld:String){
    this(firstName,lastName)
    position = positionHeld
  }

  override def toString = s"$firstName $lastName holds $position position"
}



object Run extends App{

    println("Let's create an instance")
    new Construct("sample")

    var robson = new Person("Robson", "Duarte", "Programmer")
    println(robson)

    var ana = new Person("Ana", "Duarte")
    println(ana)
}