public class Animal 
{
	private String animal_Name;
	private int animal_lbs;
	
	public Animal(String animalName, int lbs)
	{
		animal_Name = animalName;
		animal_lbs = lbs;
	}
	
	public void setWeightPounds(int lbs)
	{
		animal_lbs = lbs;
	}
	
	public void setName(String animalName)
	{
		animal_Name = animalName;
	}
	
	public String getName()
	{
		return animal_Name;
	}
	
	public int getWeightPounds()
	{
		return animal_lbs;
	}
	
	public String speak()
	{
		return "Unknown animal";
	}
}
