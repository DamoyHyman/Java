/*
 12. Consider the previous question (Ex 11), but include + or - letter grades.
 A is 4.25, A- is 3.75, B+ is 3.25, B- is 2.75 and so on.
 
 Java Program to convert letter grades into equivalent numeric grades
 */

import java.util.Scanner;
public class Assignment02_Ex12 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double gradeValue = 0.0;
		
		System.out.println("\t Letter Grade Converter!");
		
	//a) Why can't we use one switch statement with no other conditionals to convert these additional letter grades? 
		// ans- Switch statements cannot be used with strings and A+, A-, etc are strings.  
		
	//b) Write a fragment of code that will do the conversion using a multibranch if-else statement. 
		String letterGrade = " ";
		
		System.out.print("Please enter your letter grade: ");
		letterGrade = keyboard.nextLine();
		
		// For letter grade of A+, A, and A-
		/*if (letterGrade.equals("A+"))
		{
			gradeValue = 4.25;
		}
		else if (letterGrade.equals("A"))
		{
			gradeValue = 4.0;
		}
		else if (letterGrade.equals("A-"))
		{
			gradeValue = 3.75;
		}
		// For letter grade of B+, B, and B-
		else if (letterGrade.equals("B+"))
		{
			gradeValue = 3.25;
		}
		else if (letterGrade.equals("B"))
		{
			gradeValue = 3.0;
		}
		else if(letterGrade.equals("B-"))
		{
			gradeValue = 2.75;
		}
		// For letter grade of C+, C, and C-
		else if (letterGrade.equals("C+"))
		{
			gradeValue = 2.25;
		}
		else if (letterGrade.equals("C"))
		{
			gradeValue = 2.0;
		}
		else if(letterGrade.equals("C-"))
		{
			gradeValue = 1.75;
		}
		// For letter grade of D+, D, and D-
		else if (letterGrade.equals("D+"))
		{
			gradeValue = 1.25;
		}
		else if (letterGrade.equals("D"))
		{
			gradeValue = 1.0;
		}
		else if(letterGrade.equals("D-"))
		{
			gradeValue = 0.75;
		}
		else if (letterGrade.equals("F+"))
		{
			gradeValue = 0.25;
		}
		else if(letterGrade.equals("F") || letterGrade.equals("F-")) 
		{
			gradeValue = 0.0;
		}
		else
		{
			gradeValue = 0.0;
			System.out.println("Invalid letter grade entered.");
			System.exit(0);
		}*/
		
		//c)Write a fragment of code that will do the conversion using nested switch statements.
		char letterG = letterGrade.charAt(0), plusMinus = ' ';
		if (letterGrade.length() >= 2) // just incase a double sign is entered by accident
			plusMinus = letterGrade.charAt(1);
		
		switch(letterG)
		{
			case 'A':
				switch(plusMinus)
				{
					case '+':
						gradeValue = 4.25;
						break;
					case '-':
						gradeValue = 3.75;
						break;
					default:
						gradeValue = 4.0;
						break;	
				}
				break;
				
			case 'B':
				switch(plusMinus)
				{
					case '+':
						gradeValue = 3.25;
						break;
					case '-':
						gradeValue = 2.75;
						break;
					default:
						gradeValue = 3.0;
						break;
				}
				break;
				
			case 'C':
				switch(plusMinus)
				{
					case '+':
						gradeValue = 2.25;
						break;
					case '-':
						gradeValue = 1.75;
						break;
					default:
						gradeValue = 2.0;
						break;
				}
				break;
				
			case 'D':
				switch(plusMinus)
				{
					case '+':
						gradeValue = 1.25;
						break;
					case '-':
						gradeValue = 0.75;
						break;
					default:
						gradeValue = 1.0;
						break;
				}
				break;
				
			case 'F':
				switch(plusMinus)
				{
					case '+':
						gradeValue = 0.25;
						break;
					case '-':
					default:
						gradeValue = 0.0;
						break;
				}
				break;
				
			default:
				gradeValue = 0.0;
				System.out.println("Invalid letter grade entered");
				System.exit(0);
				break;		
		}
		
		System.out.println("Your equivalent letter grade of " + letterGrade.substring(0, 2) + " is: " + gradeValue);
		keyboard.close();
		System.exit(0);	
	}
}
