package br.com.mystudies.scala

object AuxiliaryConstructors extends App {

  val p1 = new Person
  val p2 = new Person("Robson")
  val p3 = new Person("Robson", 41 )

  println(p1)
  println(p2)
  println(p3)

  class Person{

    private var name = ""
    private var age = 0

    def this(name: String){ // auxiliary constructor 1
      this() // the primary Constructor
      this.name = name
    }


    def this(name: String, age: Int ){ // auxiliary constructor 2
      this(name)
      this.age = age
    }

  }

}


