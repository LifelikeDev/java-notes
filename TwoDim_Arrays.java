
public class TwoDim_Arrays {

	public static void main(String[] args) {

		// two-dimensional array
		String[][] cars = 	{
								{"Benz", "Kia", "Honda"},
								{"Toyota", "Ford", "GMC"},
								{"Mazda", "Jaguar", "Ferrari"},
								{"Honda", "BMW", "Aston Martin"},
							};
		
		
		for (int i = cars.length - 1; i >= 0; i--) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + "   ");
			}
			System.out.println(" ");
		}

	}
}
