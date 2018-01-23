package br.com.mystudies.scala

object Tuples extends App {


  // one Tuple3 of [Int, Double, java.lang.String]
  val t = ( 1, 3.14, "Fred")

  // access values
  assert(t._2 == 3.14)

  // use pattern match
  val (first, second, third) = t

  assert(first == 1)
  assert(second == 3.14)
  assert(third == "Fred")


 // use a _ if don't need all components
 val ( f, s, _) = t


 // function can return o tuple
 val t2 = "New York".partition(_.isUpper)
 assert(t2._1 == "NY")
 assert(t2._2 == "ew ork")



}