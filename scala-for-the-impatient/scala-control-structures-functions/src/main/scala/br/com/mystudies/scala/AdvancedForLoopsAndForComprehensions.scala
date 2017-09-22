

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





}