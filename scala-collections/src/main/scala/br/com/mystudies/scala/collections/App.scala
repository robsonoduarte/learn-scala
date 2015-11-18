package br.com.mystudies.scala.collections



import scala.collection.mutable.HashSet
import scala.collection.mutable.HashMap

object App extends App {
  
  
  //List(1, 2, 3, 4 ) foreach { println _}
  
  
 

  def fun(world : String ){
/*      println(world groupBy ( x => world.indexOf(x) ) )    
      println( world indices )
      println( world toSet  )
      println( world zipWithIndex )
      
      val x = world zipWithIndex;
           
      println(x)      */
  }
  
  
  
  def fun2(world : String ){
    
     var map =  HashMap.empty[Char, HashSet[Int]];
    
     world.foreach( c => {
        map.getOrElseUpdate(c, new HashSet) += world.indexOf(c)
     }) 
     
     print(map)
  }
    
  
  
   fun2("ROBSON")
 
  
}

  