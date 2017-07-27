package br.com.mystudies.scala

/*
 * java.lang and scala and Predf object are imported by default.
 *
 * class witch contains in java.lang ( Long,Double.. ) and contains in scala package are override with class in scala package.
 *
 *
 */


object Login extends App {

	def userName=  System getProperty("user.name")


	println("Please enter your password: 	")


	def password = readLine


	if( password equals("secrety") ){
	  print("Welcome : " + userName)
	}else{
		print("Password incorret" )
	}

}