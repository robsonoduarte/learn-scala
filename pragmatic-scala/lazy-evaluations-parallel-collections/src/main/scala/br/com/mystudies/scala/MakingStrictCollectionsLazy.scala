package br.com.mystudies.scala

object MakingStrictCollectionsLazy extends App {

  val people = List(("Mark", 22), ("Bob",22),("Jane",8),("Jill",21), ("Nick",50), ("Nancy",42), ("Mike", 19), ("Sara", 12), ("Paula",42), ("Jhon",21))

  def isOlderThan17(person: (String,Int))={
    println(s"isOlderTha17 called for $person")
    val (_,age) = person
    age > 17
  }


  def isNameStartWithJ(person: (String,Int)) = {
    println(s"isNameStartsWithJ called for $person")
    val (name,_) = person
    name.startsWith("J")
  }


  println(people.view.filter(isOlderThan17).filter(isNameStartWithJ).head)

}
