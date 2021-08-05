import java.awt.Point;

public class PrimVsRefTypes {

	public static void main(String[] args) {

		// Primitive Types store values in different places in the computer
		// memory and these values are independent of each other
		// Example is shown below
		
		byte first = 2;
		byte second = first;   // second == 2, even though first is altered
		first = 8;
		
		System.out.println(first);
		System.out.println(second);
		
		// Reference Types don't store values in memory. They hold a 
		// reference to objects stored in the computer memory and 
		// point to them. Thus, altering the value of the object being
		// stored in memory, alters the value they refer to
		// Example is shown below
		
		Point pointOne = new Point(1, 5);
		Point pointTwo = pointOne;
		pointTwo.x = 200;
		pointOne.y = 45;
		
		
		System.out.println(pointOne); // [x=200, y=45]
		System.out.println(pointTwo); // [x=200, y=45]
	}

}
