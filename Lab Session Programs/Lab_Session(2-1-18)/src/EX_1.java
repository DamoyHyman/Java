import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) 
	{
		java.lang.String input1 = "", input2 = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		input1 = keyboard.nextLine();
		
		System.out.print("Enter string 2: ");
		input2 = keyboard.nextLine();
		
		if (input1.length() > input2.length())
			System.out.println(input1 + " is longer.");
		else
			System.out.println(input2 + " is longer.");
		
	
		keyboard.close();
		System.exit(0);

	}

}
