

package br.com.mystudies.scala

object AdvancedForLoopsAndForComprehensions extends App {

  // this threaded for:
  for(i <- 1 to 3)
    for(j <- 1 to 3)
      print( s"${(10 * i + j)} " )
      println()

  // can do with multiple generators on the for
  for(i <- 1 to 3; j <- 1 to 3)
    print( s"${(10 * i + j)} " )
    println()

  // using the guard ( Boolean condition )
  for(i <- 1 to 3; j <-1 to 3 if i != j)
    print(s"${(10 * i + j)} ")
    println()

  // add variable in the for and use It
  for(i <- 1 to 3; from = 4 - i; j <- from to 3 )
    print(s"${(10 * i + j)} ")
    println()

  // using the yield ( comprehension loop )
  val x =  for(i <- 1 to 10) yield i % 3
  println(x)

  // the generated collection is compatible with the first generate
  val y = for(c <- "Hello"; i <- 0 to 1) yield (c + 1).toChar
  println(y) // generate string

  val z = for(i <- 0 to 1 ; c <- "Hello") yield (c + 1).toChar
  println(z) // generate Vector


  // using the loop inside braces
  for{ i <- 1 to 3;
    from = 4 - i
    j <- from to 3
  }
  print(s"${(10 * i + j)} ")


}
