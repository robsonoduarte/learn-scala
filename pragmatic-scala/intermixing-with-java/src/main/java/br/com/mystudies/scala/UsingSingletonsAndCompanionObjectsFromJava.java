package br.com.mystudies.scala;

public class UsingSingletonsAndCompanionObjectsFromJava {

	public static void main(String[] args) {

		// using the singleton ( Scala's object )
		Single.greet();

		// using the the class and companion object
		new Buddy().greet();
		Buddy$.MODULE$.greet();
	}
}
