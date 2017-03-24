package br.com.mystudies.scala

object Currying extends App {

  def inject(arr: Array[Int], initial: Int)(operation : (Int, Int) => Int) ={
    var carryOver = initial
    arr.foreach(elm => carryOver = operation(carryOver, elm))
    carryOver
  }


  val arr = Array(1,3,4,1,6)
  val sum = inject(arr, 0 ){(x,y) => x + y}


  println(sum)

}