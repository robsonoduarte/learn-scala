package br.com.mystudies.from.scala

object OperatorOverloading extends App {

  
  
  
  val c1 = new Complex(1,2)
  val c2 = new Complex(2,-3)
  val c3 = new Complex(2,2)
  
  val sum = c1 + c2
  
  println(s"($c1) + ($c2) = $sum")  
  
  // test the precedence on methods
  println(c1 + c2 * c3)
 
}




class Complex(val real: Int, val imaginary: Int){
  def +(operand: Complex) ={
    println("Calling +")
    new Complex(real + operand.real, imaginary + operand.imaginary)
  }
  
  
  def *(operand: Complex) ={
		  println("Calling *")
		  new Complex(real * operand.real - imaginary * operand.imaginary, 
		        real * operand.imaginary + imaginary * operand.real)
  }
  
  
  override def toString = {
    val sign = if(imaginary<0) "" else "+"
    s"$real$sign${imaginary}i"  
  }
    
}

