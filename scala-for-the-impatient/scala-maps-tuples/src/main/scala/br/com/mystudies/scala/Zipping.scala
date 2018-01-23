package br.com.mystudies.scala

object Zipping extends App {


  val symbols = Array("<", "-", ">")
  val counts = Array(2,10,2)

  // create one array of tuples
  val pairs = symbols.zip(counts)


  //the pairs can then be processed together
  for((s,n) <- pairs ) println( s * n )


}