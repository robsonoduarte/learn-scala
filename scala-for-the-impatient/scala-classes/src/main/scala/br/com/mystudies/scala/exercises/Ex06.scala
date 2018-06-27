package br.com.mystudies.scala.exercises

/**
 * In the Person class of Section 5.1 , “Simple Classes and Parameterless Methods,” on page 49 ,
 * provide a primary constructor that turns negative ages to 0.
 */
object Ex06 extends App {
  
  class Person(var age:Int){
    if(age < 0 ) age = 0
  }
    
  val person = new Person(-2)
    
  assert(person.age == 0)  
}