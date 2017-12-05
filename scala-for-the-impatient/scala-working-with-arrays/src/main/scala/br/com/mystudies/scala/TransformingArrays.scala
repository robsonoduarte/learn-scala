package br.com.mystudies.scala

object TransformingArrays extends App {


  val a = Array(2,3,5,7,11)


  // use for(..) yield loop creates a new collection
  val r1 = for( elem <- a ) yield 2 * elem
  println( r1 mkString " " )



  // use a guard: an if inside the for
  val r2 = for( elem <- a if elem % 2 == 0 ) yield 2 * elem
  println( r2 mkString " " )


  // using the functions
  val r3 = a.filter(_ % 2 == 0).map(2 * _)
  println( r3 mkString " " )

}