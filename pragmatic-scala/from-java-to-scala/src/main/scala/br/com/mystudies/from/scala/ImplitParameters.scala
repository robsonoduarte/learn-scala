package br.com.mystudies.from.scala


object ImplicitParameters extends App{

  def connectToNetwork(user: String)(implicit wifi: Wifi){}




}






class Wifi(name: String) {
	override def toString = name
}