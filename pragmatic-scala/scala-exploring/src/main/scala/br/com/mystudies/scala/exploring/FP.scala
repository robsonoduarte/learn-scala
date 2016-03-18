package br.com.mystudies.scala.exploring

object FP extends App {








  def findMaxImperative( temperatures: List[Int] ) = {
     var higtTemperature = Integer.MIN_VALUE
     for(temperature <- temperatures){
       higtTemperature = Math.max(higtTemperature, temperature)
     }
     higtTemperature
  }





  def findMaxFunctional(temperatures: List[Int]) = {
      // one complete form
     // temperatures.foldLeft(Integer.MIN_VALUE)((a,b) => Math.max(a, b))
      temperatures.foldLeft(Integer.MIN_VALUE){Math.max}
  }



  // for more details about foldLeft see:
  //http://oldfashionedsoftware.com/2009/07/10/scala-code-review-foldleft-and-foldright/







  println(findMaxImperative(List(30, 10, 22, 55, 1)))
  println(findMaxFunctional(List(30, 10, 22, 55, 1)))


}