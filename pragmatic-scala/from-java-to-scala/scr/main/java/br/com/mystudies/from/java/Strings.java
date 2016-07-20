package br.com.mystudies.from.java;

public class Strings {

	public static void main(String[] args) {

		// Multi line strings

		String str = "\"Java language\" redirects here. "
				+ "\nFor the natural language from the Indonesian island of Java, see Javanese language."
				+ "\nThis article is about a programming language. For the software package downloaded from java.com, "
				+ "\nsee Java SE.Not to be confused with JavaScript.";

		System.out.println(str);

		// Strings interpolation

		double discount = 50;

		String message = "A discount of " + discount + "% has been applied";

		System.out.println(message);

	}
}
