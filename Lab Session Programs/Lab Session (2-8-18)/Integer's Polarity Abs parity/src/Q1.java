import java.util.Scanner;
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		int absolute = 0;
		String polarity = " ";
		String parity = " ";
		
		System.out.print("Enter an integer: ");
		input = keyboard.nextInt();
		
		absolute = Math.abs(input);
		
		if (input < 0)
			polarity = "negative number";
		else if(input > 0) 
			polarity = "positive number";
		else
			polarity = "zero";
		
		if (absolute % 2 == 0)
			parity = "even number";
		else
			parity = "odd number";
		
		
		
		keyboard.close();
		
		System.out.println(input + " is a " + polarity + ", its absolute value is " + absolute + ", and " + absolute +
						   " is an " + parity);
	}

}