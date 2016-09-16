package br.com.mystudies.java;

public class Generic {

	public static void main(String[] args) {
		echo("Robson", "Duarte");
		echo(1, 5);
		echo(1, "Robson");
	}


	private static <T> void echo(T input1, T input2) {
		System.out.println("got " + input1 + " " +  input1.getClass() + " " +  input2 + " " + input2.getClass());
	}


}
