import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String s1 = " ";
		char c = ' ';
		
		System.out.print("Please enter a one line question or statement: ");
		s1 = keyboard.nextLine();
		
		c = s1.charAt(s1.length() - 1);
		
		switch(c)
		{
			case '?':
					int length = s1.length();
					if (length % 2 == 0)
						System.out.println("Even");
					else
						System.out.println("Odd");
					break;
				
			case '!':
				System.out.println("Wow");
				break;
			
			default:
				System.out.println("NULL");
			
		}
		keyboard.close();
		System.exit(0);

	}

}
