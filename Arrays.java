
public class Arrays {

	public static void main(String[] args) {

		// METHOD 1
		String[] cars = {"BMW", "Benz", "Ford", "Toyota", "Mustang", "Jeep", "Mitsubishi"};
		
		// METHOD 2
		String[] brands = new String[5];
		brands[0] = "Hyundai";
		brands[1] = "Kia";
		brands[2] = "Honda";
		brands[3] = "Daewoo";
		
		for (int i = brands.length - 1; i >= 0; i--) {
			
			System.out.println(brands[i]);
			System.out.println("- - -");
			System.out.println(cars[i]);
			System.out.println("---------------------");
		}
		
//		System.out.println(brands);
		
	}

}
