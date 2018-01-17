package br.com.mystudies.scala

object UpdatingMapValues extends App {


  val scores = collection.mutable.Map( "Alice" -> 10, "Bob" -> 3, "Cindy" -> 8 )


  // update the mutable map
  scores("Bob") = 10

  assert( scores("Bob") == 10)

  
  
  

}