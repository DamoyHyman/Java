import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
		int input = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an int:");
		input = keyboard.nextInt();
		
		
		if (input % 2 == 0)
		{
			System.out.println(input + " is even.");
		}
		
		else 
		{
			System.out.println(input + " is odd.");
		}
		 
		keyboard.close();

	}

}
