import java.text.NumberFormat;

public class FormatingNumbers {

	public static void main(String[] args) {

		// currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String amount = currency.format(10233948.98);
		System.out.println(amount);
		
		// pecentage
		NumberFormat percent = NumberFormat.getPercentInstance();
		String value = percent.format(0.235);
		System.out.println(value);
		
		// METHOD CHAINING --- BETTER SYNTAX
		String share = NumberFormat.getPercentInstance().format(0.4);
		System.out.println(share);
	}

}
