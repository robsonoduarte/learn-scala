package br.com.mystudies.scala

import CardSuit._

object Main extends App {



	  println(Conversions inchesToCentimeters(2.55))
	  println(Conversions milesToKilometers(2))
	  println(Conversions gallonsToLiters(2))

	  println(InchesToCentimeters inchesToCentimeters(4))
	  println(MilesToKilometers milesToKilometers(2.5))

	  var o1 = Origin

	  o1.setLocation(1, 1);
	  println(o1)

	  var o2 = Origin

	  o2.setLocation(2, 2);
	  println(o2)
	  println(o1)

	  val p = Point(1,2)

	  println(p x)
	  println(p y)


	  println(Clubs)
	  println(Diamonds)
	  println(Spades)
	  println(Hearts)

}