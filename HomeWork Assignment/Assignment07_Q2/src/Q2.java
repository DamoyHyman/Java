/*2- Write a recursive method that will compute 
 * the number of odd digits in a number.
 * 
 * Name:Damoy Hyman
 */
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int digits = 0;
		
		System.out.print("Please enter a number: ");
		digits = keyboard.nextInt();
		System.out.println("The number of odd digits is: " + oddDigitCounter(digits));
		
		keyboard.close();
		System.exit(0);
	}
	
	public static int oddDigitCounter(int number) 
	{
	    if (number == 0) 
	    {
	        return 0;
	    }
	    
	    return (number & 1) + oddDigitCounter(number / 10);
	}
}
