/*
 Name: Damoy Hyman
 */
import java.util.Scanner;
public class Lab4_Q3 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double total = 0.0, avg = 0.0, grade = 0.0;
		int testamount = 1;
		
		do
		{
			System.out.print("Enter your grade on Test " + testamount + " : ");
			grade = keyboard.nextDouble();
			total += grade;
			
			avg = total / testamount;
			testamount++;
			
			if (grade != -1)
			{
				if (avg < 70) 
				{
					System.out.println("Your test average fell too low. Please retake the class ");
					System.exit(0);
				}
			
				else
				{
					System.out.print("Your test average in the class is ");
					System.out.printf("%.1f", avg);	
					System.out.println("\n");
				}
			}
		}
		while(grade != -1);
		
		System.out.println("Goodbye...");
		System.exit(0);
		
		
		
		keyboard.close();

	}

}
