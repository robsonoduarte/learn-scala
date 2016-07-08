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



  atOffice


}








class Wifi(name: String) {
	override def toString = name
}