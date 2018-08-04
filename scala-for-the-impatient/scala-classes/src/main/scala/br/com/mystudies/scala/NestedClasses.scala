package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

class NestedClasses {
  
  val chatter = new Network
  val myFace = new Network
  
  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  
  fred.contacts += wilma
  
  val barney = myFace.join("Barney")
  //fred.contacts += barney -> No can't add a myFace.Member to a buffer o chatter.Members elements
  
}

/*
 * In scala , we can nest just anything inside anything
 * 
 * like functions inside another functions and classes inside other class
 */
class Network{
  class Member(val name: String){
    val contacts = new ArrayBuffer[Member]
  }
  
  private val members = new ArrayBuffer[Member]
  
  
  def join(name: String ) = {
    val m = new Member(name)
    members += m
    m
  }
  
  
}