package br.com.mystudies.from.scala


object ImplicitParameters extends App{

  def connectToNetwork(user: String)(implicit wifi: Wifi) = println(s"User: $user connected to  WIFI $wifi")


  def atOffice = {
    println("--- at the office ---")
    implicit def officeNetwork = new Wifi("office-network")
    val cafeteriaNetwork = new Wifi("cafe-connect")

    connectToNetwork("Robson")(cafeteriaNetwork)
    connectToNetwork("Duarte")
    connectToNetwork("Oliveira")
  }



  def atRobsonHome = {
		  println("--- at Robson office ---")
		  implicit def homeNetwork = new Wifi("home-network")

		  connectToNetwork("Robson")(homeNetwork)
		  connectToNetwork("Duarte")
  }


  atOffice
  atRobsonHome

}








class Wifi(name: String) {
	override def toString = name
}