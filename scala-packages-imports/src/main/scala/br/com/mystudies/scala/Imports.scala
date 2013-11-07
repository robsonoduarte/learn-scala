package br.com.mystudies.scala


import java.util.HashMap
import scala.collection.JavaConversions._




class Imports {


  def toScalaHashMap(map: HashMap[Int,String]) = {
    val m: scala.collection.mutable.Map[Int,String] = map
    m
  }
}