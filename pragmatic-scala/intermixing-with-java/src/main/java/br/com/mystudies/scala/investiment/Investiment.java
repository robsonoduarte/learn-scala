package br.com.mystudies.scala.investiment;

public class Investiment {

	private String investmentName;
	private InvestimentType investimentType;

	public Investiment(String investmentName, InvestimentType investimentType) {
		super();
		this.investmentName = investmentName;
		this.investimentType = investimentType;
	}


	public int yield() {return 0;}

}
