package br.com.mystudies.scala

import scala.collection.mutable.ArrayBuffer

class NestedClasses {
  
}


class Network{
  class Member(val name: String){
    val contacts = new ArrayBuffer[Member]
  }
  
  /*private */
}