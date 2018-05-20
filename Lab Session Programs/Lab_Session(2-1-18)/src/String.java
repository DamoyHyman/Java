
import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		java.lang.String s1 = " ";
		java.lang.String turncate = " ";
		
		System.out.print("Enter a string: ");
		s1 = keyboard.nextLine();
		System.out.print("What word would you like to turncate the string at: ");
		turncate = keyboard.nextLine();
		
		s1 = s1.substring(0, s1.indexOf(turncate));
		
		System.out.println("The newly updated string: " + s1);
		keyboard.close();
		System.exit(0);
	}

} 
