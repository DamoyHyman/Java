import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) 
	{
		System.out.println("Hello out there");
		System.out.println("I will add two numbers for you.");
		System.out.println("Enter two whole numbers on a line:");
		
		int n1 = 0, n2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		
		while (n1 < 0 || n2 < 0 ) // Error checking for negative values 
		{
			if (n1< 0)
			{
				System.out.println("your first number is less than 0");
				System.out.println("Re-enter your first number:");
				n1 = keyboard.nextInt();
			}
			
			else if (n2 < 0)
			{
				System.out.println("your second number is less than 0");
				System.out.println("Re-enter your second number:");
				n2 = keyboard.nextInt();
			}
		}
		
		
		System.out.println("The sum of the two numbers is");
		System.out.println(n1 + n2);
		
		// Closing the keyboard object.
		keyboard.close();

	}

}
