package br.com.mystudies.scala

import collection.JavaConversions.mapAsScalaMap
import collection.JavaConversions.propertiesAsScalaMap
import collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._


object InteroperatingWithJava extends App {


  // Java TreeMap to Mutable Scala Map
  val scores: collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]



  // Java util Properties to Scala Map
  val props: collection.Map[String,String] = System.getProperties


  // Scala Map to Java Map
  val attrs = Map(FAMILY -> "Serif", SIZE -> 12 ) // scala map
  val font = new java.awt.Font(attrs) // Expects a Java Map



}