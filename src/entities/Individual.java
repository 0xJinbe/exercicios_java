package entities;

public class Individual extends TaxPayer {

	private Double helthExpenditures;

	public Individual(String name, Double anualInconme, Double helthExpenditures) {
		super(name, anualInconme);
		this.helthExpenditures = helthExpenditures;
	}

	public Double getHelthExpenditures() {
		return helthExpenditures;
	}

	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualInconme() < 20000.0) {
			return getAnualInconme() * 0.15 - helthExpenditures * 0.5;
		} else {
			return getAnualInconme() * 0.25 - helthExpenditures * 0.5;
 		}
	}

}
