package br.com.mystudies.scala

object Extending extends App {
  print(new Truck(10,2016,100))
}



class Vehicle(val id: Int, val year: Int){
  override def toString = s"ID: $id Year: $year"
}



class Truck(override val id: Int, override val year: Int, var fuelLevel: Int) extends Vehicle(id,year){
  override def toString = s"${super.toString()} Fuel Level: $fuelLevel"
}


/*

 THE CLASS COMPILED

javap -p Vehicle.class
Compiled from "Extending.scala"
public class br.com.mystudies.scala.Vehicle {
  private final int id;
  private final int year;
  public int id();
  public int year();
  public java.lang.String toString();
  public br.com.mystudies.scala.Vehicle(int, int);
}
*/



/*

 THE CLASS COMPILED

javap -p Trunk.class
Compiled from "Extending.scala"
public class br.com.mystudies.scala.Truck extends br.com.mystudies.scala.Vehicle {
  private int fuelLevel;
  public int id();
  public int year();
  public int fuelLevel();
  public void fuelLevel_$eq(int);
  public java.lang.String toString();
  public br.com.mystudies.scala.Truck(int, int, int);
}
*/

