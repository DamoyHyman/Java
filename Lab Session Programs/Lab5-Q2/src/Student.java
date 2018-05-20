import java.util.Calendar;

public class Student 
{
	public String name; 
	public String zNumber; 
	public String major; 
	public double gpa; 
	public int birthYear; 
	public int credits;
	
	public void initialize(String studentName, String studentZNumber, String studentMajor, double studentGPA, int studentBirthYear, int studentCredits)
	{
		name = studentName;
		zNumber = studentZNumber;
		major = studentMajor;
		gpa = studentGPA;
		birthYear = studentBirthYear;
		credits = studentCredits;
	}
	
	public void studentAge()
	{
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR);       // The current year
		int age = year - birthYear;
		System.out.println(name + " is " + age + " years old.\n");
	}
	
	public void studentProfile() 
	{
		System.out.println("Student name: " + name);
		System.out.println("Student Z#: " + zNumber);
		System.out.println("Student Major: " + major);
		System.out.println("Student GPA: " + gpa + "\n");
		
	}
	
	public void studentYear() 
	{
		if (credits < 30)
		{
			System.out.println(name + " is a Freshman.\n");
		}
		else if (credits < 60)
		{
			System.out.println(name + " is a Sophomore.\n");

		}
		else if (credits < 90)
		{
			System.out.println(name + " is a Junior.\n");
		}
		else if (credits >= 90)
		{
			System.out.println(name + " is a Senior.\n");
		}
	}
}
