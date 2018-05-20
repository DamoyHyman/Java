/*
 Name: Damoy Hyman
 */
import java.util.Scanner;
public class Lab4_Q4 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double accountBalance = 0.0, withdrawal = 0.0, deposit = 0.0;
		int opt = 0;
		System.out.println("\tWelcome to the ATM");
		
		do 
		{
			System.out.println("Please select an option:");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdrawal");
			System.out.println("3 - Check Account Balance");
			System.out.println("4 - Logout");
			System.out.print("Option: ");
			opt = keyboard.nextInt();
			
			switch(opt)
			{
				case 1:
					System.out.print("How much would you like to deposit? $" );
					deposit = keyboard.nextDouble();
					
					if (deposit > 0) 
						accountBalance += deposit;
					
					System.out.print("The balance in the account is now $");
					System.out.printf("%.2f", accountBalance);
					System.out.println("\n");
					break;
					
				case 2:
					System.out.print("How much would you like to withdraw? $");
					withdrawal = keyboard.nextDouble();
					
					if (withdrawal < 0)
					{
						System.out.println("Invalid withdrawal amount");
					}
					else if(withdrawal > accountBalance)
					{
						System.out.print("You do not have enough funds to withdraw $");
						System.out.printf("%.2f",withdrawal);
						System.out.println("\n");
					}
					else 
					{	
						accountBalance -= withdrawal;
						System.out.print("The balance in the account is now $");
						System.out.printf("%.2f", accountBalance);
						System.out.println("\n");
					}
					break;
					
				case 3:
					System.out.print("The balance in the account is now $");
					System.out.printf("%.2f", accountBalance);
					System.out.println("\n");
					break;
					
				//default:
					//System.out.println("Invalid option selected! Please try again.");
					//break;
			}
			
		}
		while(opt != 4);
		
		keyboard.close();
		System.out.println("Thank you! Goodbye");
		System.exit(0);
	}

}
