package br.com.mystudies.scala.higher.order.functions

object UsefulHigherOrderFunctions extends App {


 // the basic concept of Higher-Order Functions is a function should following one of this categories:

 // >> takes one or more functions as an input
 // >> outputs a function


 // for more information about the concept of Higher-Order functions see in:
 // http://en.wikipedia.org/wiki/Higher-order_function


 // A good way of becoming comfortable with higher-order function
 // is using some methods in Scala collections library that take functions parameters.


  // Using map to applies a function in the all elements of a collection

  // full syntax to minimal syntax >> See ParameterInference.scala
	println((1 to 9 ) map ((x: Int) => 2 * x))
	println((1 to 9 ) map ((x) => 2 * x))
	println((1 to 9 ) map (x => 2 * x))
  println((1 to 9 ) map (2 * _))


  // Using foreach to applies on function in all elements returned by map function.

  // full syntax
  (1 to 9) map ((x: Int) => "*" * x) foreach ((s: String) =>  println(s))

  //minimal syntax
  (1 to 9) map ("*" * _) foreach (println _)



  // Using a binary function ( a function with two parameters )

  // full syntax
  println((1 to 9) reduceLeft ((x: Int, y: Int )  => x * y ))

  // minimal syntax
  println((1 to 9) reduceLeft (_ * _) )






  def max(x: Array[Int]) = x reduceLeft( (x: Int, y: Int) =>  if(y>x) y else x)

  println(max(Array(1, 5 -1, 5 , 20 , -20 , 30)))



  //  factorial

  def factorial(x: Int) = if( x < 1) 1 else ( 1 to x ) reduceLeft (_ * _)

  println(factorial(0)) // 1
  println(factorial(6)) // (((((1*2)*3)*4)*5)*6)





  def f(x: Int) = (1 to x).foldLeft(1)(_ * _)

  println(f(0))
  println(f(6))




  // function receiving one function and apply It in another function
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs map(fun) max

  println(largest(x => 10 * x - x * x,  1 to 10))






  // ex 6
  /*def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = inputs reverseMap(fun) max

  println(largestAt( x => 10 * x - x * x,  1 to 10) )
*/





  // def. one function witch receive tuple
  def adjustToPair(ab: (Int, Int)): Int = ab match { case (a,b) =>  a + b }


  // create one vector of tuple using the zip
  var pair  = 1 to 10 zip (11 to 20)


  println(pair)
  // for each tuple apply the function
  println(pair.map(adjustToPair _))


  // apply direct in tuple
  println(adjustToPair(1,2))







  // def. one

  def f (a: (Int, Int) => Int) = Function.tupled(a)

  // direct in tuple
  println(f(_*_)(1,2))

  // map tuple and apply the function
  println(pair.map(f(_*_)))






  // example of use currying in function

  val a = Array("Hello", "World")
  val b = Array("hello", "world")

  val x = a.corresponds(b)(_.equalsIgnoreCase(_))

  println(x)



  val z = Array("Robson", "Duarte")
  val y = Array(6,8)


  val w = z.corresponds(y)(_.length == _)

  print(w)


}