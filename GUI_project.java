import javax.swing.JOptionPane;

public class GUI_project {
	
	public static void main(String[] args) {
	
		String username = JOptionPane.showInputDialog("Enter your username");
		
//		int userage = JOptionPane.showInputDialog("Enter your age please");
		// JOptionPane.showInputDialog returns a string. Hence to be able to use
		// an integer with it, there's the need to convert it to an integer
		// This is done by making use of the integer class with the parseInt method
		
		int userage = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		double userheight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (cm)"));
		
		JOptionPane.showMessageDialog(null, "Welcome " + username + ". You are " + userage + " years old and " + userheight + " cm tall. That's awesome." );
	}

}
