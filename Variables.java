
public class Variables {

	public static void main(String[] args) {

		String first = "first";
		String second = "second";
		String holder;
		
//		SWAPPING VARIABLES...
//		first = holder; // first = null
//		second = first; // second = null
//		second = "new";
//		first = second; // first = "new"
//		second = first;
		
		holder = first;
		first = second;
		second = holder;
		
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		System.out.println("holder: " + holder);
	}

}
