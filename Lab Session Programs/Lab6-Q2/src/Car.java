import java.util.Scanner;
public class Car 
{
	private String name; 
	private double horsePower; 
	private double weight; 
	
	Scanner keyboard = new Scanner(System.in);
	
	// Accessor Methods
	public String getName() 
	{
		return name;
	}
	public double getHorsePower() 
	{
		return horsePower;
	}
	public double getWeight() 
	{
		return weight;
	}
	
	// Other methods
	public void readInput()
	{
		System.out.println("\t Your Car Oasis");
		System.out.print("What is the car's name: ");
		name = keyboard.nextLine();
		System.out.print("What is the car's horsepower? ");
		horsePower = keyboard.nextDouble();
		System.out.print("What is the car's weight? ");
		weight = keyboard.nextDouble();
		System.out.println(" ");
	}
	
	public String whoFaster(Car otherCar)
	{
		if ((this.horsePower/this.weight) > (otherCar.horsePower/otherCar.weight))
			return this.name;
		
		else return otherCar.name;
	}
}
