package br.com.mystudies.scala;

public class UsingTratisFromJava {


	public static void main(String[] args) {

		// see the Writable trait without method implementation
		AWritableJavaClass aWritableJavaClass = new AWritableJavaClass();
		aWritableJavaClass.write("I am implementing one trait of Scala without method's implementation");

	}



}
