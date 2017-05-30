

package br.com.mystudies.scala

object TheForExpression extends App {

  // simple for
  for(i <- 1 to 3) {print("ho ")}

  println()

  // use yield
  val result = for(i <- 1 to 10) yield i * 2
  println(result)

  // using map
  val result2 = (1 to 10).map(_ * 2)
  println(result2)

  // using filter
  val doubleEven = for(i <- 1 to 10; if i % 2 ==0) yield i * 2
  println(doubleEven)


  // using the curly braces
  val doubleEven2 =
    for{
      i <- 1 to 10
      if i % 2 == 0
    }yield i * 2

  println(doubleEven2)




}
