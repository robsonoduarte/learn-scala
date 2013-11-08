package br.com.mystudies.scala

class BankAccount {

	private var balance = 0.0

	def deposit(value:Double) = {
	  balance += value
	}

	def withdrow = {
	  println(balance)
	}

	def total = balance

}