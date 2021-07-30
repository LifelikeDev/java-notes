import java.util.Scanner;

public class UserInput {

	public static void main (String[] args) {
		
		Scanner myScanner = new Scanner(System.in); // the standard input method
		
		System.out.println("Hello there... What is your name? ");
		String name = myScanner.nextLine();
		
		System.out.println("What is your favourite color? ");
		String color = myScanner.nextLine();
		
		System.out.println("How many pets do you own?");
		int pets = myScanner.nextInt(); // number input field
		
		myScanner.nextLine(); // use to clear input field of any new line
		
		System.out.println("What is your favourite food?");
		String food = myScanner.nextLine();
		
		// feedback 
		System.out.println("Hello there, " + name);
		System.out.println("Your favourite color is " + color);
		System.out.println("You own " + pets + " pets");
		System.out.println("... And you love to eat " + food);
		
	}
	
}
