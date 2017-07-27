package br.com.mystudies.scala.jsf

import javax.faces.bean.ManagedBean
import scala.beans.BeanProperty

@ManagedBean // jsf anotation 
class IndexBean {
  
  
  @BeanProperty
  var name = "Robson Duarte";
  
  
  
  @BeanProperty
  var message = "Hello !";
  
  
  
  def navigate() = { "navigate" }
  
  
  
  def action(){ 
     name = "Duarte"
  }
  
  
  
}