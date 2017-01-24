package br.com.mystudies.scala.types

object SupportCovariance extends App {

  val dogs = Array(new Dog("Preto"), new Dog("Malhado"))

	def workWithPets(pets: Array[Pet]) = { pets.foreach(println(_))}

  //workWithPets(dogs) --> Compile error because the method accepts the array of Pets. But the method is benign and Scala doesn't know that.

  // But we can tell to Scala that it's okay.
  def playWitPets[T <: Pet](pets: Array[T]) = println(s"Play with pets: ${pets.mkString(", ")}")

  playWitPets(dogs)


}

class Pet(val name:String){override def toString = name }
class Dog(override val name: String) extends Pet(name)