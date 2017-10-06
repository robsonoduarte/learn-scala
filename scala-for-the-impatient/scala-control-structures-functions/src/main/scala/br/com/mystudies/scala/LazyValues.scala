package br.com.mystudies.scala

import scala.io.Source

object LazyValues extends App {

  // the val words will be evaluated when acessed for the first time
  lazy val words = Source.fromFile("/file/not/found").mkString

  // uncomment the print to see the lazy evaluated ( will throw one java.io.FileNotFoundException)
  //print(words)
}