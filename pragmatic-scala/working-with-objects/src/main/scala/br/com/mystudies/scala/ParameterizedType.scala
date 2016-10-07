package br.com.mystudies.scala

object ParameterizedType extends App {


  def echo[T](input1:T, input2:T) = println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")

  // we can express that more clearly if our intention was to receive two different types of arguments.
	def echo2[T1, T2](input1:T1, input2:T2) = println(s"got $input1 (${input1.getClass}) $input2 (${input2.getClass})")



  echo("Robson", "Ana")
  echo(3,5)
  echo(1, "Robson")
  //echo[Int](1,"Robson") error type mismatch -> the compiler will insist that both the arguments are of type int.
  echo2(1, "Robson")


  val m1 = new Message("oi")
  val m2 = new Message(123)


  println(m1)
  println(m1 is "oi")
  println(m1 is "hi")
  println(m2 is 22)

}





class Message[T] (val content: T){
	def is(value: T) = value == content

  override def toString = s"message content is $content"
}







/*

javap -p ParameterizedType$.class
Compiled from "ParameterizedType.scala"
public final class br.com.mystudies.scala.ParameterizedType$ implements scala.App {

// remove another outputs

  public <T> void echo(T, T);
}

 */
