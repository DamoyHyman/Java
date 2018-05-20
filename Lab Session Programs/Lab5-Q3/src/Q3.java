import java.util.Scanner;

public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int opt = 0;
		BankAccount b1 = new BankAccount();
		boolean operational = true;
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
					b1.deposit();
					break;
					
				case 2:
					b1.withdraw();
					break;
					
				case 3:
					b1.viewBalance();
					break;
					
				case 4:	
					operational = false;
					System.out.println("Thank you! Goodbye");
					break;
					
				default:
					System.out.println("Invalid option selected! Please try again.\n");
					break;
			}
			
		}
		while(operational);
		
		keyboard.close();
		System.exit(0);	
	}
}

