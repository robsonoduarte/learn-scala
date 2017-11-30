package br.com.mystudies.scala

object TraversingArraysAndArrayBuffers extends App {

  val a = Array(1,2,3,4,5,6)


  // visit elements directly
  for(i <- a)
    println(i)

   // visit by index
  for( i <- 0 until a.length)
    println(a(i))


  // use for each
  a.foreach(println)

}