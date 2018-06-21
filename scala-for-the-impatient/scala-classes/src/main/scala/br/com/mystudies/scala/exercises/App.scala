package br.com.mystudies.scala


import br.com.mystudies.scala.exercises.Employee
import br.com.mystudies.scala.exercises.Car
import br.com.mystudies.scala.exercises.Student


object App{

  def main(args : Array[String]) {

	



    val student = new Student

    // java bean properties convention

    student.setId(1)
    student.setName("Robson Duarte")
    println( student.getId() + " " + student.getName())

    // scala methods

    student.id = 2
    student.name = "robsonoduarte"
    println( student.id + " " + student.name)


    // the primary constructor using default arguments
    val person = new Person()
  //  println( person.name + " " + person.age)


    val car1 = new Car("GM", "Corsa")
    val car2 = new Car("GM", "Corsa", 20)
    val car3 = new Car("GM", "Corsa", 20, "BMW")

    // the primary constructor using default arguments again

    var employee = new Employee()

    println("Name: " + employee.name + " Salary: " + employee.salary )
  }

}
