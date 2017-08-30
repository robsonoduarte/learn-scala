package br.com.mystudies.scala

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import java.util.ArrayList

class UsingScalaTest extends FlatSpec with Matchers{

  trait EmpytArrayList{
    val list = new ArrayList[String]
  }

  "a list" should "be empty on create" in new EmpytArrayList{
    list.size should be(0)
  }

  "a list" should "increase in size upon add" in new EmpytArrayList{
    list add "Milk"
    list add "Sugar"

    list.size should be(2)
  }

}