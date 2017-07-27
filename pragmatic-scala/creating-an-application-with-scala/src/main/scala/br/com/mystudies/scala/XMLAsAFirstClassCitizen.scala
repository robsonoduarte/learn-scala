package br.com.mystudies.scala

object XMLAsAFirstClassCitizen extends App {

  val xmlFragment =
    <symbols>
				<symbol ticker="AAPL"><units>200</units></symbol>
				<symbol ticker="IBM"><units>215</units></symbol>
    </symbols>


  println(xmlFragment)
  println(xmlFragment.getClass)

}