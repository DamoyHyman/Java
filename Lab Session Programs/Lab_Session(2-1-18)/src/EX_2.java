
import javax.swing.JOptionPane;

public class EX_2 {

	public static void main(String[] args) 
	{
		java.lang.String input1 = JOptionPane.showInputDialog("Enter string 1:");
		java.lang. String input2 = JOptionPane.showInputDialog("Enter string 2:");
		
		if (input1.length()> input2.length())
			JOptionPane.showMessageDialog(null, input1 + " is longer");
		else
			JOptionPane.showMessageDialog(null, input2 + " is longer");
		
		System.exit(0);

	}

}
