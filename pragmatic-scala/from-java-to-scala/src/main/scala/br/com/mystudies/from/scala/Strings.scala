package br.com.mystudies.from.scala

object String extends App {

  def multiLine = {

    var scala = """Scala is an acronym for “Scalable Language”.This means that Scala grows with you.
				  You can play with it by typing one-line expressions and observing the results.
				  But you can also rely on it for large mission critical systems, as many companies, including Twitter, LinkedIn, or Intel do."""

    println(scala)

    // using the strigMargin combination with pipe
    scala = """To some, Scala feels like a scripting language. Its syntax is concise and low ceremony;
				  |its types get out of the way because the compiler can infer them.There’s a REPL and IDE worksheets for quick feedback.
				  |Developers like it so much that Scala won the ScriptBowl contest at the 2012 JavaOne conference.""".stripMargin

    println(scala)
  }

  def regex = {
    // using to regex
    var regex = """[S-s][C-c][A-a][L-l][A-a]"""
    println("scala".matches(regex))
    println("SCALA".matches(regex))
    println("Scala".matches(regex))
    println("Scalas".matches(regex))
  }

  
  def interpolation = {
    // Interpolation
    val discount = 50.00
    val message = s"A discount of $discount has been applied"
    println(message)
  }

  
  def complex = {
    // using the curly brace for more complex expression and use the $ sign in string
		val discount = 50.00
    var price = 90
    val totalPrice = s"The amount of discount is $$${price * discount / 100} dollars"
    println(totalPrice)

  }

  
  
  
  def mutable ={
    val discount = 10
    var price = 100  //using the mutable variable interpolation
    val totalPrice = s"The amount after discount is $$${price *(1 - discount / 100.0)} dollars"
    println(totalPrice)
    
    price = 50 // change after interpolation 
    println(totalPrice) // but the result is the same because the expression was captured at the time of interpolation 
    
  }
  
  
  
  def format ={
    // using the f-interpolator to format
    val procuct = "ticket"
    val price = 25.12
    val discount = 10
    println(f"On $procuct $discount%% saves $$${price * discount / 100.00}%2.2f")
  }
  
  
  
  
  
  
  
  
  
  
  
  
  multiLine
  regex
  interpolation
  complex
  mutable
  format
  
  
}

























