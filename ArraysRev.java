import java.util.Arrays;


public class ArraysRev {

	public static void main(String[] args) {

		int[] figs = {2, 5, 8, 4, 6, 10};
		
		// printing out the content of an array
		System.out.println(Arrays.toString(figs));
		
		
		// two dimensional arrays
		int[][] twoDim = { {1, 5, 9}, {3, 7, 0} };
		
		// use deeptoString() to print out the content of two dimensional
		// arrays
		System.out.println(Arrays.deepToString(twoDim));
		
		
	}

}
