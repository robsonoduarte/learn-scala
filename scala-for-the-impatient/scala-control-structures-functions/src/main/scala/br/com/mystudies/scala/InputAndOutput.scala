package br.com.mystudies.scala

import scala.io.StdIn._

object InputAndOutput extends App {

  // for simple print use print or println function
  print("Answer: ")
  println(42)

  // for print with format use printf
  printf("Hello, %s! You are %d years old.\n", "Fred", 42)

  // read lines
  val name = readLine("Your Name: ")
  print("You age: ")
  val age = readInt
  printf("Hello, %s! Next year, you will be %d.\n", name, age + 1)
  
}
