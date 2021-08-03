
public class String_Methods {

	public static void main(String[] args) {
		
		String home = "Wellington";
		String name = "Goodman";
		String town = "    Weaton    ";
		
//		int length = home.length();
//		char charac = home.charAt(5);
//		int idx = home.indexOf("i");
//		boolean res = home.isEmpty();
		String upper = home.toUpperCase();
		String lower = home.toLowerCase();
		String repl = lower.replace("l", "h");
		
//		System.out.println(home.equals("wellington"));
//		System.out.println(home.equalsIgnoreCase("WEllington"));
//		System.out.println(length);
//		System.out.println(charac);
//		System.out.println(idx);
//		System.out.println(res);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(town.trim());
		System.out.println(repl);
		System.out.println(home.endsWith("n"));
		System.out.println(home.repeat(4));
	}

}
