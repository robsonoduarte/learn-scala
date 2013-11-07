package br.com.mystudies.scala

import java.util.HashMap

object Main extends App {


	val jMap = new HashMap[Int,String]()

	jMap put(1, "One")
	jMap put(2, "Two")
	jMap put(3, "Three")


	def i = new Imports()

	val sMap = i toScalaHashMap(jMap)

	for( x <- sMap)
	  print(x)

}