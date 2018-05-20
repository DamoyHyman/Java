import java.util.Scanner;

public class NumBabies 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int baby = 0;
		
		System.out.print("How many babies do you have or expecting: ");
		baby = keyboard.nextInt();
		
		switch(baby)
		{
			case 1: 
				System.out.println("Congratulation....!");
			    break;
			case 2: 
				System.out.println("Congratulation....Twins!");
				break;
			case 3:
				System.out.println("Congratulation....Triplets!");
				break;
			case 4:
			case 5:
				System.out.println("Congratulation....Twins!");
				break;
			default:
				System.out.println("Good luck, you're going to need it!");
				break;
		}
		
		keyboard.close();

	}

}
