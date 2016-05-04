package br.com.mystudies.from.scala

object Greetings extends App {

  for(i <- 1 to 3){
    print(s"$i,")
  }

  println("Scala Rocks!!!")




  for(i <- 1 until 3){
	  print(s"$i,")
  }

  println("Scala Rocks!!!")


  //using short form when the method take zero or one parameter
  println(1.until(3))
  println(1 until 3)



}