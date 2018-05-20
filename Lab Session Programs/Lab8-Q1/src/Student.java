public class Student 
{
	private String fullName;
	private String firstName;
	private String lastName;
	private String gradeYear;
	private double gpa;
	private int creditsComplete;
	
	public Student(String Name, double GPA, int Credits)
	{
		fullName = Name;
		gpa = GPA;
		creditsComplete = Credits;
		
		firstName = fullName.substring(0, fullName.indexOf(" "));
		lastName = fullName.substring((fullName.indexOf(" ") + 1), fullName.length());
		
		if (creditsComplete >= 0 && creditsComplete < 30) // [0, 30)
			gradeYear = "Freshman";
		else if (creditsComplete >= 30 && creditsComplete < 60) // [30, 60)
			gradeYear = "Sophomore";
		else if (creditsComplete >= 60 && creditsComplete < 90) // [60, 90)
			gradeYear = "Junior";
		else if(creditsComplete >= 90) // [90, Infinity)
			gradeYear = "Senior";
			
	}
	
	public void displayStudentProfile()
	{
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("GPA: " + gpa);
		System.out.println("Year: " + gradeYear + "\n");
	}
	
	
}
