package br.com.mystudies.scala.exercises

object Ex10 extends App {
  
  
  val r =  "Hello".zip("World")
  
  /*
   * returns a sequence of Tuple with characters from same position in each string 
   * 
   * Vector((H,W), (e,o), (l,r), (l,l), (o,d))
   */
  
  
   //use case = find difference between two strings
   
   val diff = "Hello World !".zip("hello World!").filter(t => t._1 != t._2)
   
   assert(diff == Vector(('H','h'), (' ' ,'!')))
  
  
}