package br.com.mystudies.scala.functions
import scala.math._

object FunctionWithFunctionParameters extends App {


    // DEF A FUNCTION WITH RECEIVING ONE FUNCTION AND USE IT
   def valueAtOneQuarter(f: Double => Double) = println(f(0.25))


   // using the scala.math functions.
   valueAtOneQuarter(sqrt)
   valueAtOneQuarter(ceil)


   // DEF A FUNCTION WITH RETURN OTHER FUNCTION
   def mulBy(factor: Double) = (x: Double) => println(factor * x)


   def quintuple = mulBy(5);   // def on function with factor equal 5
   quintuple(20)

}