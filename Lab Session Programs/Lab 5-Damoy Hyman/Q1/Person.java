/*
 Name: Damoy Hyman
 */
public class Person
{
	public String name;
	public double kilograms;
	public double heightMeters;
	public double BMI;
	
	public void Greeting()
	{
		System.out.println("Hello my name is " + name);
	}
	
	public void calculateBMI()
	{
		BMI = kilograms / (heightMeters * heightMeters);
		System.out.print(name + "'s BMI is: ");
		System.out.printf("%.2f\n", BMI);
		
		if (BMI < 18.5)
		{
			System.out.println(name + "'s risk category is Under Weight.\n");
		}
		else if (BMI < 25)
		{
			System.out.println(name + "'s risk category is Normal Weight.\n");
		}
		else if (BMI < 30)
		{
			System.out.println(name + "'s risk category is Overweight.\n");
		}
		else if (BMI >= 30)
		{
			System.out.println(name + "'s risk category is Obese.\n");
		}
		
	}
}
