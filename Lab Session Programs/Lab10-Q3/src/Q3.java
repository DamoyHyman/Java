import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q3 
{
	public static void main(String[] args) 
	{
		String filename = " ";
		int add_to_file = 0, count = 0;
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = null;
		boolean running = true;
		
		System.out.print("Enter filename: ");
		filename = keyboard.next();
		
		try
		{
			outputFile = new PrintWriter(filename + ".txt");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening the file " + filename);
			System.exit(0);
		}
		
		System.out.println("Enter integers to add to the file. Enter -1 when want to stop");
		
		do
		{
			count++;
			System.out.println();
			System.out.print("# " + count + ": ");
			add_to_file = keyboard.nextInt();
			
			if (add_to_file == -1)
				running = false;
			
			else 
			{
				
				outputFile.println("Count " + count + ": " +add_to_file);
				System.out.print(add_to_file + " added to " + filename);
			}
		}
		while(running);
		
		System.out.println("Numbers written to " + filename + ", file close.");
		outputFile.close();
		keyboard.close();
		
	}

}
