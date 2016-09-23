package br.com.mystudies.scala

object ParameterizedType extends App {


  def echo[T](input1:T, input2:T) = println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")



  echo("Robson", "Ana")
  echo(3,5)
  echo(1, "Robson")
  //echo[Int](1,"Robson") error type mismatch -> the compiler will insist that both the arguments are of type int.





}


/*

javap -p ParameterizedType$.class
Compiled from "ParameterizedType.scala"
public final class br.com.mystudies.scala.ParameterizedType$ implements scala.App {

// remove another outputs

  public <T> void echo(T, T);
}

 */
