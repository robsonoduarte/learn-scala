package br.com.mystudies.scala;

public class APrintableJavaClass implements Printable {

	public void print(){
		System.out.println("Reusing the implementation of trait's method");
		Printable$class.print(this);
	}

}
