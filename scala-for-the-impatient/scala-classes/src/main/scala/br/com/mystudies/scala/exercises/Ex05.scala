package br.com.mystudies.scala.exercises

import scala.beans.BeanProperty

/**
 * Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
 *
 * What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala?
 *
 * Should you?
 */

object Ex05 extends App {
  
  
  class Student(@BeanProperty var name: String, @BeanProperty var id: Long)
  
  /* javap =>    
    Scala generate the methods getName, setName, getId, setId    
    public class br.com.mystudies.scala.exercises.Student {
    public java.lang.String name();
    public void name_$eq(java.lang.String);
    public void setName(java.lang.String);
    public int id();
    public void id_$eq(int);
    public void setId(int);
    public java.lang.String getName();
    public int getId();
    public br.com.mystudies.scala.exercises.Student();
		}    
   */
  
  
   val robson = new Student("Robson", 100)
  
   assert(robson.getId == robson.id)
  
}