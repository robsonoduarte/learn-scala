package br.com.mystudies.scala

object Loops extends App {


  // while loop
  var a = 0
  while(a <= 10 ){
    println(s"Value of a: ${a}")
    a += 1
  }


 // scala don't have  for( initialize; test; update ) but you can use:
  for(i <- 0 to 10 )
    println(s"Value of i: ${i}")


  // for in String
  for( c <- "Hello")
    print(c)

}