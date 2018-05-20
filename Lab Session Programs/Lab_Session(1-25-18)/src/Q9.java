import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		float input;
		
		System.out.println("Enter a floating point value:");
		input = keyboard.nextFloat();
		keyboard.close();
		
		System.out.println("The floating value " + input + " type casts to the integer value " + (int)input);
	}

}
