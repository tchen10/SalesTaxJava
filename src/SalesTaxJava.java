import java.util.Scanner;
import java.io.FileNotFoundException;

public class SalesTaxJava {
	public static void main(String args[]) throws FileNotFoundException {
		// Get filename from the user
		Scanner userInput = new Scanner(System.in);
		System.out.print("Filename (with the extension please!) : ");
		String filename = userInput.next();
		System.out.println("Thanks! Here's your receipt!");

		// Grab the exemption list
		Tax.setExemptionList();

		// Tee up a new receipt
		Receipt receipt = new Receipt();

		// Print Receipt
		System.out.print(receipt.getReceiptFromInput(filename));
	}
}
