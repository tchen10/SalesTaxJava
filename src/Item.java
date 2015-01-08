public class Item {

	private int quantity;
	private String description;
	private double price;

	public int getQuantity() {
		return quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int newValue) {
		quantity = newValue;
	}

	public void setDescription(String newValue) {
		description = newValue;
	}

	public void setPrice(double newValue) {
		price = newValue;
	}

	// get basic sales tax for an item
	public double getBasicSalesTax() {
		if(isExempt()) {
			return 0.00;
		}
		return Tax.basicSalesTax(price);
	}

	// get import duty for an item
	public double getImportDuty() {
		if(isImported()) {
			return Tax.importDuty(price);
		}
		return 0.00;
	}

	// get total taxes on item
	public double getItemTaxes() {
		return getBasicSalesTax() + getImportDuty();
	}


	// get total taxed price on an item
	public double getTaxedPrice() {
		return quantity * (price + getItemTaxes());
	}


	// determine if item is exempt
	public boolean isExempt() {
		for (String s: Tax.getExemptionList()) {
			if(description.contains(s))
				return true;
		}
		return false;
	}

	// determine if item is imported
	public boolean isImported() {
		if(description.contains("imported")) {
			return true;
		}
		return false;
	}

}

