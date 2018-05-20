/*
 Program to find the minimum and maximum number 
 in a given integer type array of any size. 
 */
public class Q3 
{
	public static void main(String[] args) 
	{
		int arr[] = {17, 87, 6, 22, 41, 3, 13, 54};
		int minimum = Integer.MAX_VALUE,  maximum = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < minimum)
				minimum = arr[i];
			
			if(arr[i] > maximum)
				maximum = arr[i];
		}
		
		Print(arr);
		
		System.out.println("Largest number in array is: " + maximum);
		System.out.println("Smallest number in array is: " + minimum);
		
		
		

	}
	
	public static void Print(int[] a)
	{
		System.out.println("Given integer array:");
		System.out.print("[");
		for (int i = 0; i < a.length; i++)
		{
			if(i < a.length-1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i]);
		}
		
		System.out.println("]");
	}

}
