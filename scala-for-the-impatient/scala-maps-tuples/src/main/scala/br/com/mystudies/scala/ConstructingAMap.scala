package br.com.mystudies.scala

object ConstructingAMap extends App {


  // a immutable map ( defualt of Scala )
  val scores1 = Map( "Alice" -> 10, "Bob" -> 3, "Cindy" -> 8 )

  println(scores1)
  println(scores1.getClass)


  // a mutable map
  val scores2 = collection.mutable.Map("Alice" -> 12, "Bob" -> 3, "Cindy" -> 8 )

  println(scores2 )
  println(scores2.getClass)


  // another syntax to create map
  val scores3 = Map( ("Alice" ,10), ("Bob", 3), ("Cindy" , 8 ) )

  println(scores3 )

}