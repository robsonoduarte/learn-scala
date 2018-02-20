package br.com.mystudies.scala.exercises
import scala.collection.mutable.Map
import scala.io.Source
import scala.collection.mutable.HashMap
import scala.collection.immutable.TreeMap
import scala.collection.mutable.LinkedHashMap
import scala.sys.SystemProperties



object App {



  def lteggt(values: Array[Int], v:Int) = {
    var lt = 0
    var eg = 0
    var gt = 0

    for(x <- values){

      if (x > v) {
       gt =  gt + 1
      }
      if (x < v) {
       lt = lt + 1
      }
      if (x == v) {
       eg = eg + 1
      }
    }

    (lt, eg, gt)

  }





  def main(args : Array[String]) {


  	  println(lteggt(Array(2, 1, 4, -10, 3, 5, 20, 6 , -15, -8, 8, 100),5))

  	   for(x <- "Hello".zip("World")){
  	     print(x)
  	   }

  	  println("Hello".zip("World").toMap)

  }


}

