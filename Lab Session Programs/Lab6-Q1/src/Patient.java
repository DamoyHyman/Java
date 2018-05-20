public class Patient 
{
	private String name; 
	private double weight; 
	private int age; 
	
	// Mutator Methods
	public void setPatient(String pname, double pweight, int page)
	{
		name = pname;
		weight = pweight;
		age = page;
	}
	
	// Accessor Methods
	public String getName()
	{
		return name;
	}
	public double getWeight()
	{
		return weight;
	}
	public int getAge()
	{
		return age;
	}
	
	// Equals method
	public boolean patientEquals(Patient otherPatient)
	{
		return (this.name.equalsIgnoreCase(otherPatient.name)) && 
			   (this.weight == otherPatient.weight) &&
			   (this.age == otherPatient.age);
	}
}
