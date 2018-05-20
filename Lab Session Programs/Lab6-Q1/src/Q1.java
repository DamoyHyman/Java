public class Q1 
{

	public static void main(String[] args) 
	{
		// Creating 3 instances of a patient.
		Patient p1 = new Patient();
		Patient p2 = new Patient();
		Patient p3 = new Patient();
		
		// Making 2 of the 3 patients identical, and 1 patient unique. 
		p1.setPatient("Ryan Tannehill", 220.0, 26);
		p2.setPatient("Ryan Tannehill", 220.0, 26);
		p3.setPatient("Jarvis Landry", 200.0, 25);
		
		// Using the Accessor methods to print the patients attributes.
		System.out.println("\t Patients' Information:");
		System.out.print("Patient 1: ");
		System.out.println(p1.getName() + " is " + 
						   p1.getWeight() + "lbs and " +
				           p1.getAge() + " years old");
		
		System.out.print("Patient 2: ");
		System.out.println(p2.getName() + " is " + 
						   p2.getWeight() + "lbs and " +
						   p2.getAge() + " years old");
		
		System.out.print("Patient 3: ");
		System.out.println(p3.getName() + " is " + 
				  		   p3.getWeight() + "lbs and " +
		                   p3.getAge() + " years old");
		
		System.out.println(" ");
		
		// Then use the patientEquals() to compare if the patients are identical or different and print the results. 
		if (p1.patientEquals(p2))
		{
			System.out.println(p1.getName() + " is the same as " + p2.getName());
		}
		else 
		{
			System.out.println(p1.getName() + " is different from " + p2.getName());
		}
		
		if (p2.patientEquals(p3))
		{
			System.out.println(p2.getName() + " is the same as " + p3.getName());
		}
		else 
		{
			System.out.println(p2.getName() + " is different from " + p3.getName());
		}
		
		

	}

}
