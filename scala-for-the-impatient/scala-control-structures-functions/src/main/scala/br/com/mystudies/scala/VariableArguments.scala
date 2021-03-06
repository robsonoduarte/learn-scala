package br.com.mystudies.scala

object VariableArguments extends App {

  // take a variable number of arguments
  def sum(args: Int*) = {
    var result = 0
    for(arg <- args ) result += arg
    result
  }

   // call the function with as many arguments:
   println(sum( 1, 4, 9, 16 , 24 ))

   // tell to compiler to be consider an argument sequence
   println(sum( 1 to 5: _*))

   // using in recursive definition:
   def recursiveSum(args: Int*): Int = {
     if(args.length == 0) 0
     else args.head + recursiveSum(args.tail : _*)
   }

   println(recursiveSum(1, 4, 9, 16, 24))
}
