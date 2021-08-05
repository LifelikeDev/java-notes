
public class Constants {

	public static void main(String[] args) {

		float pi = 3.14F;
		pi = 4.13F;
		System.out.println(pi);
		
		// use the "final" keyword when defining a variable 
		// to assign it as a constant.
		// by convention, use uppercase to define constants
		
		final float UNASSIGNABLE = 3.14F;
//		unassignable = 4.13F; // error: cannot be reassigned
		
		System.out.println(UNASSIGNABLE);
	
		
	}

}
