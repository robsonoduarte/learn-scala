package br.com.mystudies.from.scala


object SemicolonIsOptional extends App {

   // In Scala the semicolon are optional if the line don't have multiple statements or expressions.

  // mult stat.
   val str = "str"; println("print")

   // one stat. per line
   val x = 1
   val y = 2



   // but we need put the semicolon if start the new block of code

   // here Scala started a new code block
   val list1 = new java.util.ArrayList[Int];
   {
     println("Created list1")
   }

   // but here the Scala assumes we are creating an anonymous inner class that derives form ArraList[Int]
   val list2 = new java.util.ArrayList[Int]
   {
     println("Created list2")
   }


   println(list1.getClass)
   println(list2.getClass)


}