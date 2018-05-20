package testChange;
import java.util.Scanner;

public class Change {

	public static void main(String[] args) 
	{
		int amount = 0, originalAmount = 0;
		int quarter = 0, dimes = 0, pennies = 0, nickels = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 - 99");
		originalAmount = keyboard.nextInt();
		
		while(originalAmount < 1 || originalAmount > 99)
		{
			System.out.println("Please re-enter a number between 1 - 99");
			originalAmount = keyboard.nextInt();
		}
		
		keyboard.close(); // Close the keyboard object
		
		amount = originalAmount;
		
		quarter = amount / 25; // For Quarter amount
		amount = amount % 25; // Remaining balance after quarter
		
		dimes = amount / 10; // For dimes amount
		amount = amount %10; // Remaining balance after dimes
		
		nickels = amount / 5; // For nickels amount
		amount = amount % 5; // Remaining balance after nickels
		
		pennies = amount; // Remaining balance for pennies	
		
		System.out.println("Your original amount of " + originalAmount + " cents breakes down into the following: ");
		System.out.println("Quarters needed: " + quarter);
		System.out.println("Dimes needed: " + dimes);
		System.out.println("Nickels needed: " + nickels);
		System.out.println("Pennies needed: " + pennies);
		
	}

}
