import java.util.Scanner;

public class BMI 
{
	public static final double inch_to_meter = 0.0254;
	public static final double pounds_to_kilograms = 0.453592;

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int feet = 0, inch = 0, pounds = 0;
		double BMI = 0.0, kilograms = 0.0, meters = 0.0;
		String group = " ";
		
		System.out.println("\tBMI Calculator");
		System.out.print("Enter your height in feets and inches: ");
		feet = keyboard.nextInt();
		inch = keyboard.nextInt();
		
		System.out.print("Enter your weight in pounds: ");
		pounds = keyboard.nextInt();
		
		meters = ((feet * 12) + inch ) * inch_to_meter;
		kilograms = pounds * pounds_to_kilograms;
		BMI = kilograms / (meters * meters);

		if (BMI < 18.5)
		{
			group =  "Under Weight.\n";
		}
		else if (BMI < 25)
		{
			group = "Normal Weight.\n";
		}
		else if (BMI < 30)
		{
			group ="Overweight.\n";
		}
		else if (BMI >= 30)
		{
			group = "Obese.\n";
		}
	
		System.out.println("Your risk category is: " + group);

		keyboard.close();
		System.exit(0);
	}

}
