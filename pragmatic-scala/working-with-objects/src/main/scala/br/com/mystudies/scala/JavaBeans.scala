package br.com.mystudies.scala

import scala.beans.BeanProperty

class Dude(val firstName: String, val lastName: String) {
   @BeanProperty var position : String = _

   override def toString = s"The Dude is $firstName $lastName  => $position"
}


object JavaBeans extends App  {

  val dude = new Dude("Robson", "Duarte")

  // additional javabeans set and get to position
  dude setPosition "Programmer"
  println(dude getPosition)
  println(dude)

}

/*javap -p Dude.class
Compiled from "JavaBeans.scala"
public class br.com.mystudies.scala.Dude {
  private final java.lang.String firstName;
  private final java.lang.String lastName;
  private java.lang.String position;
  public java.lang.String firstName();
  public java.lang.String lastName();
  public java.lang.String position();
  public void position_$eq(java.lang.String);
  public void setPosition(java.lang.String);
  public java.lang.String toString();
  public java.lang.String getPosition();
  public br.com.mystudies.scala.Dude(java.lang.String, java.lang.String);
}*/