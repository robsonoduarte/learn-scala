package br.com.mystudies.scala

object SimpleClassesAndParameterlessMethods extends App {
  
  // the usual way to use class
  val myCounter = new Counter // or new Counter()
  myCounter.increment()
  println(myCounter.current)

  // call a parameterless method with our without parentheses
  myCounter.current // Ok
  myCounter.current() // Also Ok 
  
  // but you can enforce the style without parentheses declaring current without ()  
    myCounter.current_ // Ok
    //myCounter.current_() //  no compile   
}


// A class is not declared as public
class Counter{ 
  private var value = 0 // You must initialize the field
  def increment() = value += 1 // Methods are public by default
  def current() = value
  def current_ = value
}
