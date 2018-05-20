import java.util.Scanner;

public class Grade {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int score = 0;
		
		System.out.print("Enter your exam score: ");
		score = keyboard.nextInt();
		char grade = ' ';
		
		if (score >= 90)
		{
			grade = 'A';
		}
		
		else if (score >= 80) 
		{
			grade = 'B';
		}
		
		else if (score >= 70)
		{
			
		}
		
		else if (score >= 60)
		{
			
		}
		
		else 
			grade = 'F';
		
		System.out.println("Your exam grade: " + grade);
		
		keyboard.close();

	}

}
