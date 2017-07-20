package br.com.mystudies.scala

class Car(val year: Int) {

  private[this] var miles = 0

  def drive(distance: Int) = miles += distance


  override
  def toString = s"year: $year miles: $miles"



}