import java.util.Scanner;
public class Quadrilateral
{
	private double side, oppositeSide, length, oppositeLength;
	Scanner keyboard = new Scanner(System.in);
	// Mutator
	public void getQuadrilateral()
	{
		System.out.println("\tQuadrilateral");
		System.out.print("Please enter your quadrilateral side: ");
		side = keyboard.nextDouble();
		
		// Checking for negative values
		while(side <= 0)
		{
			System.out.print("Invalid value.\n Please enter your quadrilateral side: ");
			side = keyboard.nextDouble();
		}
		
		System.out.print("Please enter your quadrilateral opposite side: ");
		oppositeSide = keyboard.nextDouble();
		
		// Checking for negative values
		while(oppositeSide <= 0)
		{
			System.out.print("Invalid value.\n Please enter your quadrilateral opposite side: ");
			oppositeSide = keyboard.nextDouble();
		}
		
		System.out.print("Please enter your quadrilateral length: ");
		length = keyboard.nextDouble();
		
		// Checking for negative values
		while(length <= 0)
		{
			System.out.print("Invalid value.\n Please enter your quadrilateral length: ");
			length = keyboard.nextDouble();
		}
				
		System.out.print("Please enter your quadrilateral opposite length: ");
		oppositeLength = keyboard.nextDouble();
		
		// Checking for negative values
		while(oppositeLength <= 0)
		{
			System.out.print("Invalid value.\n Please enter your quadrilateral opposite length: ");
			oppositeLength = keyboard.nextDouble();
		}
				
	}
	
	public boolean isParallelogram()
	{
		if (side == oppositeSide && length == oppositeLength)
			return true;
		else
			return false;
	}
	
	public boolean isRectangle()
	{
		if(isParallelogram())
			return true;
		else 
			return false;
	}
	
	public boolean isSquare()
	{
		if (!isRectangle())
			return true;
		else 
			return false;
	}
	
	// Accessors
	public double getSide()
	{
		return side;
	}
	
	public double getOppositeSide()
	{
		return oppositeSide;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getOppositeLength()
	{
		return oppositeLength;
	}
}
