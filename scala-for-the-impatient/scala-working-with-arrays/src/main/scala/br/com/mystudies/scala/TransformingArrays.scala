package br.com.mystudies.scala

object TransformingArrays extends App {


  val a = Array(2,3,5,7,11)


  // use for(..) yield loop creates a new collection
  var result = for( elem <- a ) yield 2 * elem
  println( result mkString " " )



}