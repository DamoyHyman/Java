import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		System.out.println("What is your name?");
		
		name = keyboard.nextLine();
		System.out.println("Hello, " + name);
		keyboard.close();
		
		

	}

}
