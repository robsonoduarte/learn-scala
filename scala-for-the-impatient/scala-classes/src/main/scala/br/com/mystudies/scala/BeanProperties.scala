package br.com.mystudies.scala

import scala.beans.BeanProperty

object BeanProperties extends App {
  
  var person = new Person
  
  // Generate four methods
  person.name = "Robson"
  person.setName(person.name + " Duarte ")
  
  println(person.name)
  println(person.getName())
  
  class Person{
	  @BeanProperty var name: String = _
  }
  
}
