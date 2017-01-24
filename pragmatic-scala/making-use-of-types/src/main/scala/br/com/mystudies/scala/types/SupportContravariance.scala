package br.com.mystudies.scala.types

object SupportContravariance extends App {

	val dogs = Array(new Dog("Preto"), new Dog("Malhado"))
	val turtles = Array(new Turtle("Speed"), new Turtle("Green"))
	val pets = new Array[Pet](10)

	copyPets(dogs, pets)// It is ok because Pet(D) is supertype of Dog(S)
	//copyPets(turtles, dogs) // It is not ok because Turtle(D) is not supertype of Dog(S)
	//copyPets(dogs, turtles) // same above but inverse



	// copy array of S to D when D is supertype of S
  def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = {
    Array.copy(fromPets, 0, toPets, 0, fromPets.size)
    println(s"The array is copied -> ${pets.mkString(", ")}")
  }


}



class Turtle(override val name: String) extends Pet(name)

