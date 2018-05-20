/* Write a program that will read a text file that contains an unknown number of movie review scores. 
 * Read the scores as Double values and put them in an instance of ArrayList. 
 * Compute the average score.
 * 
 * Name:Damoy Hyman
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Q3 
{
	public static void main(String[] args) 
	{
		String file_to_open = "MovieRating";
		Scanner inputStream = null;
		double total = 0;
		ArrayList<Double> list = new ArrayList<Double>();
		
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
		
		// Add the rating score to the list
		while(inputStream.hasNextDouble())
		{
			double in = inputStream.nextDouble();
			list.add(in);
		}
		
		// Comput the total of the rating score in the list
		for (int i = 0; i < list.size(); i++)
		{
			total += list.get(i);
		}
		double avg = total / list.size();
		
		System.out.print("The average rating in the file " + file_to_open + " is: ");
		System.out.printf("%.3f", avg);
		
		inputStream.close();
		System.exit(0);

	}

}
