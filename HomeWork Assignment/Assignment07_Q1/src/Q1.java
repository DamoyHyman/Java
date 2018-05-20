/* 1- Write a program that reads every line in a text file, removes the 
 * first word from each line, and then writes the resulting lines to a new text file.
 * 
 * Name:Damoy Hyman
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) 
	{
		String file_to_open = "test";
		String file_to_write = "result";
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		// Open file for reading
		try
		{
			inputStream = new Scanner(new File(file_to_open + ".txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + file_to_open);
			System.exit(0);
		}
		
		// Open file for writing
		try
		{
			outputStream = new PrintWriter(file_to_write + ".txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file " + file_to_write);
			System.exit(0);
		}
		
		// Reading the file to be written to another
		while(inputStream.hasNextLine())
		{
			String line = inputStream.nextLine();
			line = line.substring((line.indexOf(" ") + 1), line.length());
			outputStream.println(line);
		}
		
		// Closing the files
		inputStream.close();
		outputStream.close();

	}

}
