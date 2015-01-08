import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Receipt {
	private static DecimalFormat df = new DecimalFormat("0.00");
	private double totalTaxes;
	private double totalCost;

	// full receipt
 	public String getReceiptFromInput(String filename) throws FileNotFoundException {
		String receipt = "\n";
 		Scanner fileInput = new Scanner(new File("../" + filename));
		while (fileInput.hasNextLine()) {
			String line = fileInput.nextLine();
			receipt = receipt + getReceiptLineItem(line);
		}
		receipt = receipt
				+ "Sales Taxes: " + getTotalTaxes() + "\n"
				+ "Total: " + getTotalCost() + "\n";

		return receipt;
 	}

 	// receipt line items
	private String getReceiptLineItem(String line) {

		Scanner lineInput = new Scanner(line);
		Item item = new Item();
		item.setQuantity(lineInput.nextInt());
		lineInput.useDelimiter("\\sat\\s");
		item.setDescription(lineInput.next().trim());
		item.setPrice(lineInput.nextDouble());

		totalTaxes = totalTaxes + item.getItemTaxes();
		totalCost = totalCost + item.getTaxedPrice();

		String receiptLineItem = item.getQuantity() + " "
				+ item.getDescription() + ": "
				+ df.format(item.getTaxedPrice()) + "\n";

		return receiptLineItem;
	}

	// total taxes
	private String getTotalTaxes() {
		return df.format(totalTaxes);
	}

	// total cost
	private String getTotalCost() {
		return df.format(totalCost);
	}


}
