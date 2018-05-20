import java.util.Scanner;

public class String_Replace {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		java.lang.String s1 = " ";
		System.out.print("Enter a string delaminated by *: ");
		
		s1 = keyboard.nextLine();
		s1 = s1.replace('*', ' ');
		
		System.out.println("New string without *: " + s1);
		keyboard.close();
		System.exit(0);
	}

}
