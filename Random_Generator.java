import java.util.Random;

public class Random_Generator {

	public static void main(String[] args) {
		
		Random someRandom = new Random();
		// the Random () class is not entirely random in nature 
		// being very close to random, it's referred to as "pseudorandom"
		
//		int myFigure = someRandom.nextInt(10) + 1;
		double doub = someRandom.nextDouble();
		boolean bool = someRandom.nextBoolean();

//		System.out.println(myFigure);
		System.out.println(doub);
		System.out.println(bool);
	}

}
