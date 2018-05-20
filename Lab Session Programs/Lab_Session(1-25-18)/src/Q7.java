import java.util.Scanner;

public class Q7 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double radius = 0.0, area =0.0;
		
		
		System.out.println("Enter the radius of the circle in inches:");
		radius = keyboard.nextDouble();
		keyboard.close();
		
		area = PI * radius* radius;
		
		System.out.println("The area of a circle with radius " + radius + " is " + area);

	}

}
