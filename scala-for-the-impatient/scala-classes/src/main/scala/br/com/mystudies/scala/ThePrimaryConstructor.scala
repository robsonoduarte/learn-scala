package br.com.mystudies.scala

object ThePrimaryConstructor extends App {
  val p = new Person4("Robson Duarte", 41) 
  println(p.description) 
}


class Person4(private val name: String, private val age: Int ){ // the primary constructor 
  // all statements in the class definition will executed with primary constructor
  println("Just constructed another person")
  def description = s"${name} is ${age} years old"
}