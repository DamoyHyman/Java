import java.util.Scanner;

public class DecidesWhoOnTeam 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String fast = " ", big = " ";
		
		System.out.println("\t Football try outs: ");
		System.out.print("Are you fast? (y/n): ");
		fast = keyboard.nextLine();

		System.out.print("Are you big? (y/n): ");
		big = keyboard.nextLine();
		
		if(fast.equals("y") || big.equals("y"))
		{
			System.out.println("Congradulations, you are on the team!");
		}
		
		else if (fast.equals("n") || big.equals("n"))
		{
			System.out.println("You are cut from the team");
			
		}
		
		else
			System.out.println("");
				
		keyboard.close();
	}

}
