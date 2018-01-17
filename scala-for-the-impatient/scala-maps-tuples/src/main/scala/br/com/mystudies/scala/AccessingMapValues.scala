package br.com.mystudies.scala

object AccessingMapValues extends App {


    val scores = Map( "Alice" -> 10, "Bob" -> 3, "Cindy" -> 8 )

    assert( scores("Bob") == 3 ) // Like scores.get("Bob") in java


    // check if contains the key

    var scoreBob = if(scores contains "Bob") scores("Bob") else 0

    assert( scoreBob == 3 )





}