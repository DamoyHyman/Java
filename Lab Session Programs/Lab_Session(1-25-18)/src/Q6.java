import java.util.Scanner;

public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String name = " ";
		
		System.out.println("Enter your name");
		name = keyboard.nextLine();
		keyboard.close();
		
		System.out.println("Original name = " + name + "\n" + "Name Length = " + name.length() + "\n" + 
		"Name Capitalized = " + name.toUpperCase());
		
		
	}
}
