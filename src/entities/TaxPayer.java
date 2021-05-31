package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualInconme;
	
	public TaxPayer() {
		super();
	}

	public TaxPayer(String name, Double anualInconme) {
		super();
		this.name = name;
		this.anualInconme = anualInconme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualInconme() {
		return anualInconme;
	}

	public void setAnualInconme(Double anualInconme) {
		this.anualInconme = anualInconme;
	}
	
	public abstract Double tax();

}
