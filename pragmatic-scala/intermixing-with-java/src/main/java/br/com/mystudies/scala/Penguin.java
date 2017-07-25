package br.com.mystudies.scala;

public class Penguin extends Bird {

	@Override
	public void fly() throws NoFlyException {
		throw new NoFlyException();
	}

}
