package br.com.mystudies.scala

import scala.collection.mutable.Set




object TypeAliasing extends App {
  type Cop = PoliceOfficer

  val topCop = new Cop("Robson")
  println(topCop.getClass)
}


class PoliceOfficer(val name: String)