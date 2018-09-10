package br.com.mystudies.scala.exercises

/**
 * Write a class Person with a primary constructor that accepts a string containing a first name,
 * a space, and a last name, such as new Person("Fred Smith") . Supply read-only properties firstName and lastName .
 *
 * Should the primary constructor parameter be a var , a val , or a plain parameter? Why?
 */
object Ex07 extends App {

  class Person(name:String){
    val (firstName, lastName) = name.split(" ") match{
      case Array(x:String, y:String, _* ) => (x,y)
      case _ => (null,null)
    }
  }

  val person = new Person("Robson Duarte")

  assert(person.firstName == "Robson" )
  assert(person.lastName == "Duarte")


}