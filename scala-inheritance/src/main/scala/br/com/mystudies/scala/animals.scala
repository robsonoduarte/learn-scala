package br.com.mystudies.scala

package animals{
  
  class Animal(val name: String){}
  
  
  class Fish(name: String, val water: String) extends Animal(name) {
    override def toString = "Fish name: " + name + " | water: " + water 
  }
  
  
  class Amphibian(name:String, val color: String) extends Animal(name) {
	  override def toString = "Amphibian name: " + name + " | color: " + color
  }
  
  class Mammal(name:String, val size: Double) extends Animal(name) {
	  override def toString = "Mammal name: " + name + " | size: " + size
  }
  
}