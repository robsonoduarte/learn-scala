package br.com.mystudies.scala

object Procedures extends App {


  // A procedure returns no value, and only call it for its side effect
  def box(s: String){
     val border = "-" * s.length + "--\n"
     println(s"${border}|${s}|\n${border}")
   }


  box("Hello")

}