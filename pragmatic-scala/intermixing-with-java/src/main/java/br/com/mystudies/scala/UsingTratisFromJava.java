package br.com.mystudies.scala;

public class UsingTratisFromJava {


	public static void main(String[] args) {

		// see the Writable trait without method implemented
		Writable writable = new AWritableJavaClass();
		writable.write("I am implementing one trait of Scala without method implemeted");


		// see the Printable trait with method implemented
		Printable printable = new APrintableJavaClass();
		printable.print();

	}



}
