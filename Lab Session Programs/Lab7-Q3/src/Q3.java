import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int size = 0;
		double arr[], total = 0;
		
		System.out.print("Enter how many elements are in the array: ");
		size = keyboard.nextInt();
		
		arr = new double[size];
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter element " + (i + 1) + " in the array: ");
			arr[i] = keyboard.nextDouble();
		}
		
		for (int i = 0; i < size; i++)
		{
			total += arr[i];
		}
		
		System.out.print("The avg value of elements in the array is: ");
		System.out.printf("%.1f", total/size);
		
		keyboard.close();
		System.exit(0);
	}

}
