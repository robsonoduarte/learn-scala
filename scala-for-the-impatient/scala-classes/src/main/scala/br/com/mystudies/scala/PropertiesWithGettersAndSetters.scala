package br.com.mystudies.scala

object PropertiesWithGettersAndSetters extends App {

  val person = new Person
  
  println(person.age) // the get method
  
  person.age = 21 // the set method
  
  println(person.age)
  
  //---------------------------------------------------
  
  val privatePerson = new PrivatePerson
  
  privatePerson.age = 30
  privatePerson.age = 21
  
  println(privatePerson.age)
}


// Scala provides getter and setter methods for every field
class Person{
  var age = 0
}


/*
  javap Person.class
  Compiled from "PropertiesWithGettersAndSetters.scala"
  public class br.com.mystudies.scala.Person {
    public int age();
    public void age_$eq(int);
    public br.com.mystudies.scala.Person();
  }
*/


// you can redefine the getter and setter
class PrivatePerson{
  
  private var privateAge = 0;
 
  
  def age = privateAge
  def age_=(value:Int){
    if(value > privateAge) privateAge = value
  }    
}