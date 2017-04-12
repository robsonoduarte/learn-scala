package br.com.mystudies.scala

object EquipmentUseNotDry extends App {
   val equipment1 = new Equipment(input => {println(s"calc with $input");input})
   val equipment2 = new Equipment(input => {println(s"calc with $input");input})

   equipment1.simulate(4)
   equipment2.simulate(6)
}


object EquipmentUseDry extends App {
   val calculator = {input: Int => println(s"calc with $input"); input}

   val equipment1 = new Equipment(calculator)
   val equipment2 = new Equipment(calculator)

   equipment1.simulate(4)
   equipment2.simulate(6)
}


object EquipmentUseDry2 extends App {
	def calculator(input: Int) = {println(s"calc with $input"); input}

	val equipment1 = new Equipment(calculator)
	val equipment2 = new Equipment(calculator)


	equipment1.simulate(4)
	equipment2.simulate(6)
}




class Equipment(val routime : Int => Int){
  def simulate(input:Int)={
    print("Running simulation...")
    routime(input)
  }
}