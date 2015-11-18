package br.com.mystudies.scala.collections



import scala.collection.mutable.HashSet
import scala.collection.mutable.HashMap

object App extends App {
  
  
  //List(1, 2, 3, 4 ) foreach { println _}
  
  
 

  def fun(world : String ){
  }
  
  
  
  
  def index(world : String ){
    
     var map =  HashMap.empty[Char, HashSet[Int]];
    
     world.foreach( c => {
        map.getOrElseUpdate(c, new HashSet) += world.indexOf(c)
     })
     
     print(map)
  }
    
  
  
  index("ROBSON")
 
  
}

  