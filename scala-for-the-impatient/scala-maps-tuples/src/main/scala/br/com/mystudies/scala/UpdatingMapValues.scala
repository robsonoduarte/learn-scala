package br.com.mystudies.scala

object UpdatingMapValues extends App {


  val scores = collection.mutable.Map( "Alice" -> 10, "Bob" -> 3, "Cindy" -> 8 )


  // update the mutable map
  scores("Bob") = 10
  assert( scores("Bob") == 10)

  // add new key/value
  scores("Robson") = 15
  assert(scores("Robson") == 15 )


  // use the += operation do add multiple associations
  scores += ("Bob" -> 11, "Fred" -> 7 )
  assert(scores("Bob") == 11 && scores("Fred") == 7)


  // to remove
  scores -= "Alice"
  assert(scores.contains("Alice") == false)


  // obtain a new map with one update
  val newScores = scores + ( "Ana" -> 10, "Peter" -> 2)
  assert( newScores("Robson") == 15 && newScores("Ana") == 10 && newScores("Peter") == 2 )



}