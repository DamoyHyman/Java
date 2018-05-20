public class Q1 
{
	public static void main(String[] args) 
	{
		Animal[] pet = new Animal[2];
		pet[0] = new Dog("Buddy",41);
		pet[1] = new Cat("Whiskers",4);
		
		for (Animal i : pet) 
		{
		System.out.println("The pet name is " + i.getName()
		+ " and it weights " + i.getWeightPounds() + " pounds and says " + i.speak() );
		}

	}

}
