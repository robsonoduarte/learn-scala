package br.com.mystudies.java;

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
		miles =+ Math.abs(distance);
	}

}
