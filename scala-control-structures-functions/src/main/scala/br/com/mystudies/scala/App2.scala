package br.com.mystudies.scala
import scala.collection.immutable.StringOps



object App2 {

  def countdown(n: Int) { for (x <- 0 to n reverse) print(x + " ") }

  def product(string: String) {



    for (x <- string ) yield x toChar


    }




    def main(args : Array[String]) {



 //      countdown(20)

       product("Hello")


    }

}