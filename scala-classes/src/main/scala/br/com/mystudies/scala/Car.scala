package br.com.mystudies.scala

class Car(val manufacturer: String, val modelName: String, val modelYear: Int, var licensePlate: String){

	def this(manufacturer: String, modelName: String) = this(manufacturer,modelName,-1,"")

	def this(manufacturer: String, modelName: String, modelYear: Int) = this(manufacturer,modelName,modelYear,"")

}