/*11.Write a switch statement to convert letter grade into equivalent
 * numeric value on a four-point scale. Set the value of the variable gradevalue to
 * 4.0 for an A, 3.0 for a B, 2.0 for a C, 1.0 for a D, and 0.0 for an F. For any other
 * letter, set the value 0.0 and display an error message. 
 * 
 * Java Program for converting letter grade to numeric grade
 * Name: Damoy Hyman
 */
import java.util.Scanner;

public class Assignment02_Ex11 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double gradeValue;
		char letterGrade = ' ';
		
		System.out.println("\t Letter Grade Converter!");
		System.out.print("Please enter your letter grade: ");
		letterGrade = keyboard.next().charAt(0);
		
		switch(letterGrade)
		{
			case 'A':
			case 'a':
				gradeValue = 4.0;
				break;
			
			case 'B':
			case 'b':
				gradeValue = 3.0;
				break;
				
			case 'C':
			case 'c':
				gradeValue = 2.0;
				break;
				
			case 'D':
			case 'd':
				gradeValue = 1.0;
				break;
				
			case 'F':
			case 'f':
				gradeValue = 0.0;
				break;
				
				default:
					gradeValue = 0.0;
					System.out.println("Invalid letter grade entered");
					System.exit(0);
					break;
		}
		
		System.out.println("Your equivalent letter grade of " + Character.toUpperCase(letterGrade) + " is: " + gradeValue);
		keyboard.close();
		System.exit(0);	

	}

}
