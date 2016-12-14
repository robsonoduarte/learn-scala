package br.com.mystudies.java;

import static java.lang.Math.abs;

public class Car {

	private final int year;
	private int miles;

	public Car(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public int getMiles() {
		return miles;
	}


	public void drive(int distance){
		miles =+ abs(distance);
	}

}
