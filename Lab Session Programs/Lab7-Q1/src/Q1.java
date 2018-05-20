import java.util.Scanner;
public class Q1
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		boolean operational = true;
		int largest = Integer.MIN_VALUE, smallest =  Integer.MAX_VALUE, input = 0;
		double total =0;
		do
		{
			System.out.print("Please enter a positive integer, or -1 to quit: ");
			input = keyboard.nextInt();
			
			if (input > 0)
			{
				if (input > largest)
					largest = input;

				else if (input < smallest)
					smallest = input;
				
				total += input;
				count++;
			}
			
			else if (input == -1)
			{
				operational = false;
			}
		
		}
		while (operational);
				
		System.out.println("For the " + (count) + " numbers you entered");
		System.out.println("The largest value = " + largest);
		System.out.println("The smallest value = " + smallest);
		System.out.print("The avg is: " );
		System.out.printf("%.1f", total/count);
		
		keyboard.close();
		System.exit(0);

	}

}
