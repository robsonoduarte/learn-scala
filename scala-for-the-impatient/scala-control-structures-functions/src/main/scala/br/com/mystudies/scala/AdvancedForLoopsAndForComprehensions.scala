

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



}