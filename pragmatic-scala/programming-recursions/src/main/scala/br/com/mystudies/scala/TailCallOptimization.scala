package br.com.mystudies.scala

object TailCallOptimization extends App {



/*
 *
   @scala.annotation.tailrec
    def factorial(number: Int) : BigInt = {
      if(number == 0 ) 1
      else number * factorial(number - 1)
    }

	  Since this version of the facotrial() is a regular recursion and not a tail recursion, the compiler will report an error
  	because it can't optimized the recursion:

    [error] TailCallOptimization.scala:11: could not optimize @tailrec annotated method factorial: it contains a recursive call not in tail position
    [error]       else number * factorial(number - 1)
    [error]                   ^
    [error] one error found
    [error] (compile:compileIncremental) Compilation failed
    */



    @scala.annotation.tailrec
    def factorial(fact: BigInt, number: Int) : BigInt = {
      if(number == 0 ) fact
      else factorial(fact * number, number - 1)
    }


    println(factorial(1, 10000))

}
