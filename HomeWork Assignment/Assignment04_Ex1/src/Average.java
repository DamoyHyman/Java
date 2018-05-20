import java.util.Scanner;
import java.text.DecimalFormat;
public class Average 
{
	public static void main(String[] args) 
	{
		int num = 0, num1 = 0, num2 = 0, low = 0, high = 0;
		int opt = 0;
		Scanner keyboard = new Scanner(System.in);
		Average a1 = new Average();
		DecimalFormat dec = new DecimalFormat("#0.00");
		
		System.out.println("\t Average Calculator");
		System.out.println("Calculating the average of several integers");
		System.out.println("1. Enter two numbers you'd like to be averaged.");
		System.out.println("2. Enter the 3 numbers you want averaged.");
		System.out.println("3. Enter the number Range you want averaged.");
		System.out.print("Select one option: ");
		opt = keyboard.nextInt();
		
		// Option error checking
		while (opt > 3 || opt <= 0)
		{
			System.out.print("Invalid option. Please select options 1-3: ");
			opt = keyboard.nextInt();
		}
		
		// Option selected
		if (opt == 1)
		{
			System.out.print("Enter number 1: ");
			num = keyboard.nextInt();
			System.out.print("Enter number 2: ");
			num1 = keyboard.nextInt();
			System.out.println("The average of both numbers, " + num + " and " + num1 +
					           " is: " + dec.format(a1.averageOftwo(num, num1)));
		}
		
		else if (opt == 2)
		{
			System.out.print("Enter number 1: ");
			num = keyboard.nextInt();
			System.out.print("Enter number 2: ");
			num1 = keyboard.nextInt();
			System.out.print("Enter number 3: ");
			num2 = keyboard.nextInt();
			System.out.println("The average of the three numbers " + num + ", " + num1 + " and " + num2 +
							   " is: " + dec.format(a1.averageOfthree(num, num1, num2)));
		}
		
		else if (opt == 3)
		{
			System.out.print("Enter range from: ");
			low = keyboard.nextInt();
			System.out.print("Enter range to: ");
			high = keyboard.nextInt();
			System.out.println("The average in the range of " + low + "-" + high +
					           " is: " + dec.format(a1.averageOFrange(low, high)));
		}
		
		keyboard.close();
		System.exit(0);

}
	
	// Methods for the Average class
	public double averageOftwo (int num1, int num2) 
	{
        return (num1 + num2) / 2.0; 
	} 
	
	public double averageOfthree (int num1, int num2, int num3) 
    { 
         return (num1 + num2 + num3) / 3.0; 
    } 
	
	public double averageOFrange(int l, int h)
	{
		double rangeAverage = 0.0;
		if (h < l)
		{
			System.out.println("Error!");
		}
		else
		{
			for (int i = l; i <= h; i++)
			{
				rangeAverage += i;
			}
			rangeAverage = rangeAverage / (h-l + 1);
		}
		
		return rangeAverage;
	}

}
