package br.com.mystudies.scala.pattern.matching

abstract class Item


case class Product(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item
case class Multiple(count: Item, item: Item) extends Item



object test extends App{


  def price(it: Item): Double = it match {
    case Product(_, p) => p
    case Bundle(_,disc,its @_*) => its.map(price _).sum - disc
  }













}


