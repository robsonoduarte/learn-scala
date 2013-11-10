package br.com.mystudies.scala



package bank{
  
	class BankAccount(initialBalance: Double){
		private var balance = initialBalance
		def deposit(amount: Double) = { balance += amount; balance}
		def withdraw(amount: Double) = { balance -= amount; balance}
	}
	
	
	class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

	  	override def deposit(amount: Double) = {
	  		if (amount > 1)
	  		  super.deposit(amount)
	  		else
	  		  amount
	  	}
	
	  	override def withdraw(amount: Double) = {
	  		if (amount > 1)
	  			super.withdraw(amount)
	  			else
	  				amount
	  	}
	}
	
}
