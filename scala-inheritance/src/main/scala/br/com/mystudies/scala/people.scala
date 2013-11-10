package br.com.mystudies.scala

package people{
  
  class Person(val name: String){
    override def toString = getClass().getName() + "[name " + name + " ]"
  }
  
  
  class SecretAgent(val codeName: String) extends Person(codeName){
    override val name = "secret"
    override def toString = "secret"
  }
  
}