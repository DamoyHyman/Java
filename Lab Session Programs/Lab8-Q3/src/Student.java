import java.util.Scanner;

public class Student 
{
	private static int studentCount = 0;
	private String studentName;
	private String studentZNumber;
	
	public Student()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the students name: ");
		studentName = keyboard.nextLine();
		
		System.out.print("Enter the students Z number: ");
		studentZNumber = keyboard.nextLine();
		
		System.out.println();
		
		studentCount++;
		keyboard.close();
	}
	
	public Student(String Name, String Znum)
	{
		studentName = Name;
		studentZNumber = Znum;
		studentCount++;
	}
	
	public void StudentProfile()
	{
		System.out.println("Name: " + studentName);
		System.out.println("ZNumber: " + studentZNumber + "\n");
	}
	
	public static void NumStudents()
	{
		System.out.println("There are " + studentCount + " students");
	}
}
