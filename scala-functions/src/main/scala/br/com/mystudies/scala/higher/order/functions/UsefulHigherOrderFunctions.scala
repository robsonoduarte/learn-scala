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

}