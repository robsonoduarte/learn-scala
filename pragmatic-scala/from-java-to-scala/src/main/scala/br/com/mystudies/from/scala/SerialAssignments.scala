package br.com.mystudies.from.scala

object SerialAssignments extends App {
  
  
  /*
   * In Java we can do multiple assignments like:
   * 
   * x = b = c
   *
   * But is Scala we can't do it because the assignment like:
   * 
   * x = b 
   * 
   * Return one Unit and assigning that result to another value or variable may result in a type mismatch
   *   
   */
  
   
  var a = 1
  var b = 2
  
  print(a = b)
  
  
  // a = b = 3 this not compile 
 
}