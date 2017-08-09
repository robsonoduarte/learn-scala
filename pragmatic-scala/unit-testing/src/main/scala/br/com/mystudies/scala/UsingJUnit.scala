package br.com.mystudies.scala

import org.junit.Test
import org.junit.Assert._

class UsingJUnit {

  @Test
  def listAdd(){
    val list = List("Milk","Sugar")
    assertEquals(2, list size)
  }



}