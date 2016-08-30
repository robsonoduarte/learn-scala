package br.com.mystudies.scala

object UseCar extends App {

   val car = new Car(2015)


   println(s"Car made in year ${car.year}")
   println(s"Miles driven ${car.miles}")
   println(s"Drive for 10 miles")
   car drive 10
   println(s"Miles driven ${car.miles}")
}



class Car(val year: Int){
  private var milesDriven : Int = 0
  def miles = milesDriven
  def drive(distance: Int) = milesDriven += Math.abs(distance)
}