package br.com.mystudies.scala

object ConditionalExpressions extends App {

	  // return one type of value ( Int )
   	def ce1(x: Int) = if (x>0) 1 else -1

   	// mixed-type expression
   	def ce2(x: Int) = if (x>0) "positive" else -1

   	// else part is omitted
   	def ce3(x: Int) = if (x>0) 1

	  // equivalent a condition above
	  def ce4(x: Int) = if (x>0) 1 else ()



	 println(ce1(-1).getClass())
	 println(ce2(1).getClass())
	 println(ce2(-1).getClass())
	 println(ce3(-1).getClass())
	 println(ce4(-1).getClass())

}
