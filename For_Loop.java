import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int times = scanner.nextInt();
		System.out.println("Initializing...");
		
		for (int i = 1; i <= times; i++) {
			System.out.println(i + " hello there %d...");
			String.format("Hello %s", "world")
		}
		
		System.out.println("Finalizing...");
		scanner.close();
	}

}
