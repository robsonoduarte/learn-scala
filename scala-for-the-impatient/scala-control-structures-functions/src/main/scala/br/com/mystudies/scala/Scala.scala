package br.com.mystudies.scala

object Scala {

	def containsUpperCase(s: String) = {
	 	s.toCharArray.exists( (c: Char) => c.isUpper )
	}


  	def main(args: Array[String]) {
		  println(containsUpperCase("Scala"))
		  println(containsUpperCase("scala"))
  	}

}