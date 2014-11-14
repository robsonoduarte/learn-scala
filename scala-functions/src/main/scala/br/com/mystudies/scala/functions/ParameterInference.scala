package br.com.mystudies.scala.functions

object ParameterInference extends App {

   def trible(f: Double => Double) = println(f(3))


   trible { (x: Double) => 3 * x } // the full form
   trible { (x) => 3 * x } // but the function know you need pass (Double) => Double, then you can omit the type of parameter
   trible {  x => 3 * x } // if function has just one parameter, you can omit the () around the parameter
   trible {  3 * _ } // if a parameter occurs only once on the right-hand => you can replace with a underscore


   // IT ONLY WORK WHEN THE PARAMETER TYPES ARE KNOWN

   //val fun = 3 * _ // don't compile because the compiler can't inferred type of parameter

   // OK because the type is declared
   var fun1 = 3 * (_:Double)
   trible {fun1}

   // OK because the type is specified  (Double) => Double
   val fun2:  (Double) => Double = 3 * _
   trible { fun2 }


}