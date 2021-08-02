import java.util.Scanner;

public class Density_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the mass (kg) of your object");
		double mass = scanner.nextDouble();
		
		System.out.println("Enter the weight (volume (m3)) of your object");
		double volume = scanner.nextDouble();
		
		double density = mass / volume;
		
		System.out.println("The volume of your object is " + density + " kg/m3");
		
		scanner.close();
		

	}

}
