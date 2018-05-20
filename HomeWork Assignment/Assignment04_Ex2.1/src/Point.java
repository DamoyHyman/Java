public class Point 
{
	private double x, y;
	
	// Default Constructor 
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	// Copy Constructor
	public Point(double new_x, double new_y)
	{
		x = new_x;
		y = new_y;
	}
	
	// Accessor
	public double getX() 
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	// Mutator
	public void setX(double new_x)
	{
		x = new_x;
	}
	
	public void setY(double new_y)
	{
		y = new_y;
	}
	
	public String toString()
	{
		return "("+ x +"," + y +")";
	}
}
