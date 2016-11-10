package br.com.mystudies.scala

class Construct(param:String) {
  println(s"Creating an instance of Construct with parameter $param")
}



class Person(val firstName: String, val lastName: String){
  var position: String = _
  println(s"Creating --> ${toString}")

  @Deprecated
  def this (firstName: String,lastName:String,positionHeld:String){
    this(firstName,lastName)
    position = positionHeld
  }

  override def toString = s"$firstName $lastName holds $position position"
}



object Construct extends App{

    println("Let's create an instance")
    new Construct("sample")


    println("-----------------------------------------------------")


    var robson = new Person("Robson", "Duarte", "Programmer")
    println(robson)

    var ana = new Person("Ana", "Duarte")
    println(ana)
}


/*javap -p Person.class
public class br.com.mystudies.scala.Person {
  private final java.lang.String firstName;
  private final java.lang.String lastName;
  private java.lang.String position;
  public java.lang.String firstName();
  public java.lang.String lastName();
  public java.lang.String position();
  public void position_$eq(java.lang.String);
  public java.lang.String toString();
  public br.com.mystudies.scala.Person(java.lang.String, java.lang.String);
  public br.com.mystudies.scala.Person(java.lang.String, java.lang.String, java.lang.String);
}*/






