
public class Casting {
	
	public static void main (String[] args) {
		
		// implicit casting (done by Java under the hood)
		// in order to give a correct answer, Java creates an anonymous
		// variable of type INT somewhere in memory and copies the value 
		// of "a" to it, then adds 6 to it. Thus, all are integers and give
		// a correct answer of the same type (INT)
		// byte > short > int > long > float > double
		
		short a = 2;
		int b = a + 6;
		
		System.out.println(b);
		
		// explicit casting (done intentionally or done by the dev)
		double x = 1.358;
		// int y = x + 2;	
		// x is a double, both y and 2 are int
		int y = (int) x + 2;	// x now becomes 1, instead of 1.3
		
		System.out.println(y);	// y = 3
		
		
		// ALL THE ABOVE ARE FOR COMPATIBLE TYPES
		// ie. number data types (byte, short, int, long, etc.)
		// For non-compatible types, like String to int, we use 
		// wrapper classes
		String num = "1";
		int actualNum = 99 + Integer.parseInt(num);
		// the Integer wrapper class with the parseInt method, converts
		// the string 1 to an int 1 which can be added to 99
		System.out.println(actualNum);
		
		
	}
	
}