package br.com.mystudies.scala

import java.io.PrintWriter
import java.io.File
import scala.io.Source

object ReadingAndWritingFiles extends App {

  // using the java.io to create an write in file
  val writer = new PrintWriter(new File("symbols.txt"))
  writer write "AAPL"
  writer.close

  // using the Scala's Source class and it companion object
  println("*** The content of the file you rea is: ")
  Source.fromFile("symbols.txt").foreach(print)

  println()

  // read from one URL
  val source = Source.fromURL("http://httpstat.us/200")

  println(s"What's Source? : ${source}")
  println(s"Raw String: ${source.mkString}")


}