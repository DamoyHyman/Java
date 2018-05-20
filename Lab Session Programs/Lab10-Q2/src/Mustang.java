public class Mustang implements Car
{
	private int speed = 0;
	private int gear = 0;
	
	
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	
	public void speedUp(int increment)
	{
		speed += increment;
	}
	public void applyBrakes(int decrement)
	{
		if(speed > 0)
			speed -= decrement;
	}
	
	public void printStates()
	{
		System.out.println("Speed: " + speed);
		System.out.println("Gear: " + gear);
	}
}
