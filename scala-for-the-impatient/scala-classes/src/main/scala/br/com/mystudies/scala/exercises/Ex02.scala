package br.com.mystudies.scala.exercises

/**
 * Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
 */
object Ex02 extends App {

  class BankAccount(private var _balance:Double = 0.0) {

  	def deposit(value:Double) = {
  	  _balance += value
  	}

  	def withdrow(value: Int ) = {
  	  if(_balance - value > 0 ){
  	    _balance -= value
  	  }
  	}

	  def balance = _balance
  }


  val myBA = new BankAccount
  myBA.deposit(100)
  myBA.withdrow(20)

  assert( myBA.balance == 80.0 )


}