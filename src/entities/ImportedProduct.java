package entities;

public class ImportedProduct extends Prod {

	private Double customsFees;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, Double price, Double customsFees) {
		super(name, price);
		this.customsFees = customsFees;
	}

	public Double getCustomsFees() {
		return customsFees;
	}

	public void setCustomsFees(Double customsFees) {
		this.customsFees = customsFees;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFees;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFees)
				+ ")";
	}

}
