package br.com.mystudies.from.scala

object MultipleAssgnment extends App {


  def getPersonInfo(key: Int) = {
    ("Robson", "Duarte", "robson.o.d@gmail.co")
  }


  val (firstName, lastName, email) = getPersonInfo(1)


  println(s"First Name: $firstName")
  println(s"Last Name: $lastName")
  println(s"Email : $email")


}