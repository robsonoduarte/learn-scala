package br.com.mystudies.scala

object Greeter {
  def greet = println("Hello !")
}

/*
javap -private Greeter
Warning: Binary file Greeter contains br.com.mystudies.scala.Greeter
Compiled from "Greeter.scala"
public final class br.com.mystudies.scala.Greeter {
  public static void greet();
}
*/