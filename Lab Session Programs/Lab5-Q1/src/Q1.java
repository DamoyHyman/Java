/*
 Name: Damoy Hyman
 */
import java.util.Scanner;

public class Q1 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Creating 3 separate instances of the person class
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// Assigning each person a name, kilograms, and heightMeters
		p1.name = "Aubrey Graham";
		p1.kilograms = 54.4311; // <- 120lbs in kilograms
		p1.heightMeters = 1.6256; // <- 5'4" in meters
		
		p2.name = "CJ Johnson";
		p2.kilograms = 95.2544; // <- 210lbs in kilograms
		p2.heightMeters = 1.8288; // <- 6'0" in meters
		
		p3.name = "Rachel Green";
		p3.kilograms = 38.5554; // <- 85lbs in kilograms
		p3.heightMeters = 1.524; // <- 5'0" in meters
		
		p1.Greeting();
		p1.calculateBMI();
		
		p2.Greeting();
		p2.calculateBMI();
		
		p3.Greeting();
		p3.calculateBMI();
		
		keyboard.close();

	}
}
