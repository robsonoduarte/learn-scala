package br.com.mystudies.scala

import java.io.File

object ASequentialTimeConsumingProblem extends App {


  def getChildren(file: File) ={
    val children = file listFiles

    if(children != null) children toList else List()
  }


  val start = System nanoTime
  val exploreFrom = new File("C:/Users/Robson/")

  var count = 0L
  var filesToVist = List(exploreFrom)


  while(filesToVist.size > 0){
    val head = filesToVist.head
    filesToVist = filesToVist.tail

    val children = getChildren(head)

    count = count + children.count(!_.isDirectory())
    filesToVist = filesToVist ::: children.filter(_.isDirectory())
  }


  val end = System nanoTime

  println(s"Number of files found: $count")
  println(s"Time taken: ${ ( (end - start)/1.0e9 ) } seconds")

}