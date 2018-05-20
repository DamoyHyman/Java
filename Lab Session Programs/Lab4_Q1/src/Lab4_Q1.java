/*
 Name: Damoy Hyman
 */
import java.util.Scanner;
public class Lab4_Q1 
{
	enum LetterGrade{A, B, C, D, F}
	
	public static void main(String[] args) 
	{
		LetterGrade studentGrade;
		Scanner keyboard = new Scanner(System.in);
		double grade1 = 0.0, grade2 = 0.0, avg = 0.0;
		
		System.out.print("Enter the number grade you received on the first test: ");
		grade1 = keyboard.nextDouble();
		
		System.out.print("Enter the number grade you received on the second test: ");
		grade2 = keyboard.nextDouble();

		avg = (grade1 + grade2) / 2;
		
		if (avg >= 90)
		{
			studentGrade = LetterGrade.A;
		}
		else if (avg >= 80 && avg <= 89)
		{
			studentGrade = LetterGrade.B;
		}
		else if (avg >= 70 && avg <= 79)
		{
			studentGrade = LetterGrade.C;
		}
		else if (avg >= 60 && avg <= 69)
		{
			studentGrade = LetterGrade.D;
		}
		else
		{
			studentGrade = LetterGrade.F;
		}
		
		switch(studentGrade)
		{
			case A:
				System.out.println("Great job! You received an " + studentGrade);
				break;
				
			case B:
				System.out.println("Good work! You received a " + studentGrade);
				break;
				
			case C:
			case D:
				System.out.println("You passed. You recieved a " + studentGrade);
				break;
				
			default:
				System.out.println("You have to retake the class. You received an " + studentGrade);
				break;
		}
		
		keyboard.close();
		System.exit(0);
	}

}
