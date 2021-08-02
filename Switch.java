import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog("1: Blue, 2: Green, 3: Red. Choose One!"));
		
		switch(choice) {
		case 1:
			JOptionPane.showMessageDialog(null, "You are peaceful");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You are calm");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You are on fire");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Sorry. You're nothing");;
		}
		
	}

}
