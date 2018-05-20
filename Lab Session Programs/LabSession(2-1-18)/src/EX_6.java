import javax.swing.JOptionPane;

public class EX_6 
{

	public static void main(String[] args)
	{
		String s1 = JOptionPane.showInputDialog("Enter a string:");
		String turnacate = JOptionPane.showInputDialog("What word would you like to truncate the string at?");
				
		s1 = s1.substring(0, s1.indexOf(turnacate));
				
		JOptionPane.showMessageDialog(null, s1);
		System.exit(0);
	}

}

