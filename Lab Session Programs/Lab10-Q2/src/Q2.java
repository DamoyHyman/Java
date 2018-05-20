public class Q2 
{
	public static void main(String[] args) 
	{
		Mustang mustang = new Mustang();
		mustang.changeGear(2);
		mustang.speedUp(50);
		mustang.applyBrakes(10);
		
		System.out.println("Mustang present state :");
		mustang.printStates();
	}

}
