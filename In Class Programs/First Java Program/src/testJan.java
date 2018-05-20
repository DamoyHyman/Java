
import javax.swing.JOptionPane;

public class testJan 
{
	public static final double PI = 3.14159;
	
	public static void main(String[] args) 
	{
		/*String appS = JOptionPane.showInputDialog("Enter the number of apples");
		int appC = Integer.parseInt(appS);
		
		String orgS = JOptionPane.showInputDialog("Enter the number of oranges");
		int orgC = Integer.parseInt(orgS);
		
		int total = appC+ orgC;
		
		JOptionPane.showMessageDialog(null, "The total number of fruits = " + total);
		*/
		
		String radius = JOptionPane.showInputDialog("Enter the radius of your circle"); // Get the radius of the circle from the user using a dialog box
		double input = Double.parseDouble(radius); // Convert the user's input to a double
		double area = PI * input * input; // Compute the area of the circle
		JOptionPane.showMessageDialog(null, "\tThe area of your circle is\n A = " + area); // Display the calculated value of the area of the circle
		
		System.exit(0);

	}

}
