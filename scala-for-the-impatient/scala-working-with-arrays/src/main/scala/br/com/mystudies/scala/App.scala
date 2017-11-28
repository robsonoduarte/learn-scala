package br.com.mystudies.scala
import scala.collection.mutable.ArrayBuffer


object App{
  
  def ex2 = {
    
	  val x = Array(2, 1, 4, 3, 5, 8)
	  
	  
	  for( i <- 0 until x.length )	    
		if( i % 2 != 0){
			var y = x(i-1)
			x(i-1) = x(i) 
			x(i) = y
		}
	    
      for(i <- x )
        print(i)
    
  }
  
  def ex3 = {
		  
	   val x = Array(2, 1, 4, 3, 5, 8)
				  				  
		for( i <- 0 until x.length if i % 2 != 0 ) yield x(i) 	    
 			  
  }
  
  
  def ex5(x: Array[Double])= {print(x.sum / x.length)}
  
  
  def ex6(x: Array[Int])= {for( a <- x reverse) print(a)}

  
  def ex6a(x: ArrayBuffer[Int])= {for( a <- x reverse) print(a)}

  
  def ex7(x: Array[Int])= { for ( a <- x distinct ) print(a) }
  
  

  def main(args : Array[String]) {
    
	  ex2	 	
	  println()
	  for( x <- ex3)
	  	print(x)
	  println()
	  ex5(Array(2.2, 2.3, 3.5 , 3.5 ))
	  println()
	  ex6(Array(5,4,3,2,1))
	  println()
	  ex6a(ArrayBuffer(5,4,3,2,1))
	  println()
	  ex7(Array(5,4,3,2,1,5,4,3,2,1,7,7,9))
	
  }

  
}
