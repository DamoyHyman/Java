import java.util.Scanner;

public class Lexicographic_Order 
{

	public static void main(String[] args) 
	{
		String s1 = " ", s2 = " ";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		s1 = keyboard.nextLine();
		
		System.out.print("Enter the second string: ");
		s2 = keyboard.nextLine();
		
		int reVal = s1.compareTo(s2);
		
		if (reVal > 0)
		{
			System.out.println(s2 + " proceeds " + s1);
		}
		
		else if (reVal == 0)
		{
			System.out.println(s1 + " is equal to " + s2);
		}
		
		else
		{
			System.out.println(s1 + " proceeds " + s2);
		}

		keyboard.close();
		System.exit(0);
	}

}
