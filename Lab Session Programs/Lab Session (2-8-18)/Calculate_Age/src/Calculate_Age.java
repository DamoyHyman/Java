import java.util.Scanner;

public class Calculate_Age 
{

	public static void main(String[] args) 
	{
		int age = 0, birth = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What year where you born? ");
		birth = keyboard.nextInt();
		
		age = 2018 - birth;
		
		if (age > 18)
		{
			if(age > 30)
			{
				
			}
			
			else if (age > 50)
			{
				
			}
		}
		
		else
		{
			System.out.println("You are not an adult.");
		}
		
		keyboard.close();
		System.exit(0);

	}

}
