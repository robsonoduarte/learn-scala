package br.com.mystudies.scala;


public class AWritableJavaClass implements  Writable{

	@Override
	public void write(String message) {
		System.out.println(message);
	}

}
