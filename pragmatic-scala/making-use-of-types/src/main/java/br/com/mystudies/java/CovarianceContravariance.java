package br.com.mystudies.java;

import java.util.ArrayList;

public class CovarianceContravariance {



	public static void main(String[] args) {

		Banana[] basketOfBanana = new Banana[2];
		basketOfBanana[0] = new Banana();

		Fruit[] basketOfFruits = basketOfBanana;
		basketOfFruits[1] = new Apple();


		for (Banana banana : basketOfBanana) {
			System.out.println(banana);
		}

		// the code compile with no errors but when execute:

		/*
		 * Exception in thread "main" java.lang.ArrayStoreException: br.com.mystudies.java.CovarianceContravariance$Apple
			at br.com.mystudies.java.CovarianceContravariance.main(CovarianceContravariance.java:13)
		*/

		// It happen because we're trying to place an apple into basket of bananas
		// and the root cause is that the Java compiler did not stop us in line 12


		// Than we can do something like:
		ArrayList<Integer> list1 = new ArrayList<>();
		//ArrayList<Object> list2 = list1; --> and give on compilation error

		// but we can bypass in compiler:
		ArrayList list3 = list1;
	}




	public static class Fruit{}
	public static class Banana extends Fruit{}
	public static class Apple extends Fruit{}

}


