/*
Previous Exercise: Write some Java statement that use the String methods indexOf and
sub-string to find the first word in a string. We define word to be a string of characters
that does not include whitespace. For example, the first word of the string
"Hello, my good friend!"
is the string "Hello," and the second word is the sting "my"

8. Repeat the previous exercise, but find the second word in the string.

Java Program for finding the first and second word of a string
Name: Damoy Hyman
*/

import java.util.Scanner;

public class Assignment02_Ex8 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String word = "Hello, my good friend!";
		String first = " ";
		String second = " ";
		int index_first = 0;
		int index_second = 0;
		
		//System.out.print("Enter a string: ");
		//word = keyboard.nextLine();
		
		// Finding the first word.
		index_first = word.indexOf(" "); // the location of the first whitespace.
		first = word.substring(0, index_first); // first word from location 0 up to the location of the first whitespace.
		
		// Finding the second word
		second = word.substring((index_first + 1), word.length()); // get the rest of the remaining string from the first whitespace up to
																   // the full length of the string.
		index_second = second.indexOf(" "); // find the location of the second whitespace in the remaining string
		second = second.substring(0, index_second); // the second word from location 0 of the remaining string, up to the location of 
													// the second whitespace.
		
		System.out.println("The string: " + "\"" + word + "\"");
		System.out.println("The first string: " + first);
		System.out.println("The second string: " + second);
		
		keyboard.close();
		


	}

}
