package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

class NestedClasses {
  
}



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