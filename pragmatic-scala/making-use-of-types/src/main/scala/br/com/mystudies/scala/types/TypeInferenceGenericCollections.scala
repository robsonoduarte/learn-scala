package br.com.mystudies.scala.types

import java.util._

object TypeInferenceGenericCollections extends App{


  // type inference in java collections as well
  var list1: List[Int] = new ArrayList[Int] // indicate the type
  var list2 = new ArrayList[Int] // inference the type





  // Scala prohibits any conversion tha may cause typing issues


  var list3 = new ArrayList[Int]
  var list4 = new ArrayList


 // list4 = list3 // <-- error in compilation

 // behind the scenes Scala create an instance of ArrayList[Nothing] to list4 and the Nothing is in the bottommost place in the type hierarchy

  /*
	[error]  found   : java.util.ArrayList[Int]
	[error]  required: java.util.ArrayList[Nothing]
	[error] Note: Int >: Nothing, but Java-defined class ArrayList is invariant in type E.
	[error] You may wish to investigate a wildcard type such as `_ >: Nothing`. (SLS 3.2.10)
	[error]   list4 = list3 // <-- error in compilation
	[error]           ^

   */




  // If we use the Any

  var list5 = new ArrayList[Int]
  var list6 = new ArrayList[Any]

  // list6 = list5 // error in compilation again

  // By default Scala dosen't allow assigning collection with arbitrary types.

  /*
	[error]  found   : java.util.ArrayList[Int]
	[error]  required: java.util.ArrayList[Any]
	[error] Note: Int <: Any, but Java-defined class ArrayList is invariant in type E.
	[error] You may wish to investigate a wildcard type such as `_ <: Any`. (SLS 3.2.10)
	[error]  list6 = list5
	[error]          ^
   */






 var ref1: Int = 1
 var ref2: Any = null

 ref2 = ref1 // it's work because equivalent to assigning an Integer to a Object


}
