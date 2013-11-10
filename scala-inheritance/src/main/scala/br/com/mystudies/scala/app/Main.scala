
package br.com.mystudies.scala.app


import br.com.mystudies.scala.animals.Fish
import br.com.mystudies.scala.animals.Amphibian
import br.com.mystudies.scala.animals.Mammal
import br.com.mystudies.scala.bank.CheckingAccount
import br.com.mystudies.scala.itens.SimpleItem
import br.com.mystudies.scala.itens.Bundle
import br.com.mystudies.scala.itens.Bundle
import br.com.mystudies.scala.shapes.LabelPoint
import br.com.mystudies.scala.shapes.Square
import br.com.mystudies.scala.people.Person
import br.com.mystudies.scala.people.SecretAgent


object Main extends App {

  val ca = new CheckingAccount(3)

  println(ca deposit(-1))
  println(ca deposit(2))

  println(ca withdraw(-1))
  println(ca withdraw(2))


  val cod = new Fish("cod", "salinity")
  val frog = new Amphibian("frog", "green")
  val human = new Mammal("Robson", 1.82)

  println(cod)
  println(frog)
  println(human)



  val item = new SimpleItem(1.0, "simple item")

  println(item price)
  println(item description)



  val bundle = new Bundle()

  bundle.addItem(new SimpleItem(1.0, "simple item 1 "))
  bundle.addItem(new SimpleItem(1.0, "simple item 2 "))
  bundle.addItem(new SimpleItem(1.0, "simple item 3 "))
  bundle.addItem(new SimpleItem(1.0, "simple item 4 "))
  bundle.addItem(new SimpleItem(1.0, "simple item 5 "))
  bundle.addItem(new SimpleItem(1.0, "simple item 6 "))


  println(bundle.price)
  println(bundle.description)
  
  
  
  val point = new LabelPoint("black point", 2.0, 3.0);
  
  
  println(point.label)
  println(point.x)
  println(point.y)

  
  
  
  val square1 = new Square(1,1,1)
  val square2 = new Square(1)
  val square3 = new Square(1,1)
  
  println(square1)
  println(square2)
  println(square3)
  

  
  val person = new Person("Robson");
  val secretAgent = new SecretAgent("agent")
  
  println(person)
  println(secretAgent)
  println(secretAgent.name)
  println(secretAgent.codeName)
  
}
