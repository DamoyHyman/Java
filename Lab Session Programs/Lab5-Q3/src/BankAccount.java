import java.util.Scanner;

public class BankAccount 
{
	public double accountBalance = 0; 
	Scanner keyboard = new Scanner(System.in);
	
	public void deposit()
	{
		System.out.print("How much would you like to deposit? $" );
		double deposit = keyboard.nextDouble();
		
		if (deposit > 0) 
			accountBalance += deposit;
		
		System.out.print("The balance in the account is now $");
		System.out.printf("%.2f", accountBalance);
		System.out.println("\n");
	}
	
	public void withdraw()
	{
		System.out.print("How much would you like to withdraw? $");
		double withdrawal = keyboard.nextDouble();
		
		if (withdrawal < 0)
		{
			System.out.println("Invalid withdrawal amount");
		}
		else if(withdrawal > accountBalance)
		{
			System.out.print("You do not have enough funds to withdraw $");
			System.out.printf("%.2f", withdrawal);
			System.out.println("\n");
		}
		else 
		{	
			accountBalance -= withdrawal;
			System.out.print("The balance in the account is now $");
			System.out.printf("%.2f", accountBalance);
			System.out.println("\n");
		}
		
	}
	
	public void viewBalance() 
	{
		System.out.print("The balance in the account is now $");
		System.out.printf("%.2f", accountBalance);
		System.out.println("\n");
	}
}
