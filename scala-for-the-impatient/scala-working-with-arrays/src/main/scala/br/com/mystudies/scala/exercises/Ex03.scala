package br.com.mystudies.scala.exercises

/**
 * Repeat the preceding assignment, but produce a new array with the swapped values. Use for / yield .
 */
object Ex03 extends App {



  def swaps(array:Array[Int]) = {
     (for( i <- 0 until array.length) yield
       if(i % 2 != 0) array(i-1)
       else if( i % 2 == 0 ) array(i+1)
      ).toArray
  }


  print( swaps(Array(2, 1, 4, 3, 5, 8)).deep == Array(1, 2, 3, 4, 8 ,5).deep)
}
