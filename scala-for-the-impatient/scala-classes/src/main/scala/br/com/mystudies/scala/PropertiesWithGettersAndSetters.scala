package br.com.mystudies.scala

object PropertiesWithGettersAndSetters {

  val person = new Person
  
  println(person.age)
  
  
}


// Scala provides getter and setter methods for every field
class Person{
  var age = 0
}
