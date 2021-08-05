import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final byte PERCENT = 100;
		final byte MONTHS_IN_A_YEAR = 12;
		
		// principal
		System.out.print("Principal: ");
		int principal = scanner.nextInt();
		
		// annual interest rate (in months)
		System.out.print("Annual Interest Rate: ");
		float interestRate = scanner.nextFloat();
		float userInputRate = (interestRate / PERCENT) / MONTHS_IN_A_YEAR;
		
		// period (years) in months
		System.out.print("Period (Years): ");
		byte userInputPeriod = scanner.nextByte();
		int period = userInputPeriod * MONTHS_IN_A_YEAR;
		
		// calculation
		double numerator = userInputRate * Math.pow((1 + userInputRate), period);
		double denominator = (Math.pow((1 + userInputRate), period)) - 1;
		double rateFraction = numerator / denominator;
		
		// mortgage
		double mortgage = principal * rateFraction;
		
		// mortgage in currency format
		String mortgageAmount = 					NumberFormat.getCurrencyInstance().format(mortgage);
		
		System.out.println("\n");
		System.out.println("Mortgage: " + mortgageAmount);
		
		scanner.close();
	}

}
