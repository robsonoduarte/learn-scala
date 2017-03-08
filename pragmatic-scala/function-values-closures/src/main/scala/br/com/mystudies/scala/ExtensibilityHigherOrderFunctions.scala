package br.com.mystudies.scala

object ExtensibilityHigherOrderFunctions extends App {


  def totalResultOverRange(number: Int, codeBlock: Int => Int) = {

    var result = 0
    for(i <- 1 to number)
      result += codeBlock(i)
      result
  }


/*println(totalResultOverRange(11, (i: Int) => i))*/
  println(totalResultOverRange(11, i => i)) // Scala was able to infer that th type of parameter
  println(totalResultOverRange(11, i => if(i % 2 == 0) i else 0))
  println(totalResultOverRange(11, i => if(i % 2 != 0) i else 0))




}