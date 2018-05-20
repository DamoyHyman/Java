public class Q2 
{
	public static void main(String[] args) 
	{
		// Creating two instances of different cars
		Car c1 = new Car();
		Car c2 = new Car();
		
		// Using the readInput() method to assign the cars information
		c1.readInput();
		c2.readInput();
		
		// Then call the whoFaster() method and print which car is faster.
		System.out.println("The " + c1.whoFaster(c2) + " is the faster car\n");
	}

}
