package br.com.mystudies.scala

object Scala {

	def containsUpperCase(s: String) = {
		s.toCharArray.exists( (c: Char) => c.isUpperCase )
	}


  	def main(args: Array[String]) {
		println(containsUpperCase("Scala"))
		println(containsUpperCase("scala"))
  	}

}