import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number (1-10)...");
		
		int numb = scanner.nextInt();
		
		if (numb <= 0 || numb > 10) {
			System.out.println("WRONG INPUT. Please enter a number between 1 and 10");
		} else if (numb % 2 == 0) {
			System.out.println("Your number is an EVEN number");
		} else {
			System.out.println("Your number is an ODD number");
		}
		
		scanner.close();
	}

}
