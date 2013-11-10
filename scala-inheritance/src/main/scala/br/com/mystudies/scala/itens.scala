package br.com.mystudies.scala

package itens{

import scala.collection.mutable.ArrayBuffer
  
  abstract class Item{    
	  def price: Double	  
	  def description: String
  }
  

  class SimpleItem(val price: Double, val description: String) extends Item{    
  }
  
  
  class Bundle extends Item{
    
    val itens = ArrayBuffer.empty[Item]
        
    def addItem(item: Item) = itens += item
        
    def price() = {
    	var x = 0.0 
    	for(i <- itens)
    	  x += i.price    	      
    	 x	
    }
    
    
    def description = {
    	var x = ""
    	for(i <- itens) 
    		x += i.description
    	x
    }
    
  }
  
}