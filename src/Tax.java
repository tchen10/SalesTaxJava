import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tax {

	// tax percentage rates
	private static double basicSalesTaxRate = 0.10;
	private static double importDutyRate = 0.05;

	// an array list for the exemptions
	private static ArrayList<String> exemptionList = new ArrayList<String>();

	// set the exemptions
	public static void setExemptionList() throws FileNotFoundException {
		Scanner exemptionInput = new Scanner(new File("../exemptions.txt"));
		while (exemptionInput.hasNextLine()) {
			String exemption = exemptionInput.nextLine();
			exemptionList.add(exemption);
		}
	}

	// get the exemptions
	public static ArrayList<String> getExemptionList() {
		return exemptionList;
	}

	// basic sales tax formula
	public static double basicSalesTax(double price) {
		return rounded(price * basicSalesTaxRate);
	}

	// import duty formula
	public static double importDuty(double price) {
		return rounded(price * importDutyRate);
	}

	// rounding to nearest .05
	private static double rounded(double tax) {
		return (Math.ceil((tax) * 20) / 20);
	}

}
