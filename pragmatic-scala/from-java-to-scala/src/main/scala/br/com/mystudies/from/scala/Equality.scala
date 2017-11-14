package br.com.mystudies.from.scala

object Equality extends App {
  
  
  val str1 = "Robson"
  val str2 = "Robson"
  val str3 = new String("Robson")
  
  
  println( str1 == str2) // Equivalent to Java's str1.equals(str2)
  println( str1 eq str2) // Equivalent to Java's str1 == str2 
  println( str1 == str3)
  println( str1 eq str3)
}
