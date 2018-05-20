import javax.swing.JOptionPane;

public class Strring_Replace_GUI 
{
	public static void main(String[] args)
	{
		java.lang.String s1 = JOptionPane.showInputDialog("Enter a string delaminated by *: ");
		s1 = s1.replace('*', ' ');
		
		JOptionPane.showMessageDialog(null, "New string without *: " + s1);
		
		System.exit(0);
	}	
	
}
