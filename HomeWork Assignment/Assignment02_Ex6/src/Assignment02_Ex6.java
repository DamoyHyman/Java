/*
6. We would like to assess a service charge for cashing a check. The service
charge depends on the amount of the check. If the check amount is less
than $10, we will charge $1. If the amount is greater than $10 but less than
$100, we will charge 10 percent of the amount. If the amount is greater than 
$100, but less than $1,000, we will charge $5 plus 5 percent of the amount. If
the value is over $1,000, we will charge $40 plus 1 percent of  
the amount. Use a multibranch if-else statement in a fragment of code
to compute the service charge.

Java Program for computing service charge
Name: Damoy Hyman
 */
import java.util.Scanner;

public class Assignment02_Ex6 
{
	
	public static final double fee_of_5_percent = 0.05;
	public static final double fee_of_1_percent = 0.01;
	public static final double fee_of_10_percent = 0.1;

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double check = 0.0, serviceCharge = 0.0;
		
		System.out.print("Please enter your check amount: $");
		check = keyboard.nextDouble();
		
		if (check < 10)
		{
			serviceCharge = 1.0;
		}
		
		else if (check > 10 && check < 100)
		{
			serviceCharge = check * fee_of_10_percent;
		}
		
		else if (check > 100 && check < 1000)
		{
			serviceCharge = check * fee_of_5_percent + 5;
		}
		
		else if (check > 1000)
		{
			serviceCharge = check * fee_of_1_percent + 40;
		}
		
		keyboard.close();
		
		System.out.print("Check amount: $");
		System.out.printf("%.2f\n", check);
		
		System.out.print("Service Charge: $");
		System.out.printf("%.2f\n", serviceCharge);
		
		System.out.print("Total amount: $");
		System.out.printf("%.2f\n", (check + serviceCharge));
		
		System.exit(0);


	}

}
