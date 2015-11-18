package br.com.mystudies.scala.collections



import scala.collection.mutable.HashSet
import scala.collection.mutable.HashMap

object App extends App {
  

  
  
  
  def indexes1(world : String ) = {
     var map =  HashMap.empty[Char, HashSet[Int]];     
     world foreach( c => {
        map getOrElseUpdate(c, new HashSet) += world.indexOf(c)  
     })     
     map
  }
    
  
   print(indexes1("ROBSON OLIVEIRA DUARTE"))
 
  
   
   
   
  
}

  