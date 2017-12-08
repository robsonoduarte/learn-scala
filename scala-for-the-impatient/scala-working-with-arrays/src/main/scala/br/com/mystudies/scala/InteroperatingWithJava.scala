

package br.com.mystudies.scala

import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Buffer

object InteroperatingWithJava extends App {


   // convert ArrayBuffer in java.util.List
   val command = ArrayBuffer("ls", "-al", "/home/robson")
   val pb = new ProcessBuilder(command) // receive on java.util.List in constructor


   // convert to scala.collection.mutable.Buffer
   val cmd : Buffer[String] = pb.command


}