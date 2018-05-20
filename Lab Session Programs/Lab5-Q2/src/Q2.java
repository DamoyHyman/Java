/*
 Name: Damoy Hyman
 */

public class Q2 
{

	public static void main(String[] args) 
	{
		// Creating two instances of the student class
		Student s1 = new Student();
		Student s2 = new Student();
		
		// Initializing students
		s1.initialize("Corey", "Z42342342", "Computer Engineering", 4.0, 1995, 105);
		s2.initialize("Rachel", "Z42532982", "Computer Science", 3.89, 1989, 65);
		
		s1.studentAge();
		s1.studentProfile();
		s1.studentYear();
		
		s2.studentAge();
		s2.studentProfile();
		s2.studentYear();
	}
}
