public class Q2 
{

	public static void main(String[] args) 
	{
		int arr[] = {17, 87, 6, 22, 41, 3, 13, 54};
		MergeSort Ms = new MergeSort();
		
		System.out.println("Given Array:");
		Print(arr);
		
		/*Worst case time complexity for the Merge Sort algorithm 
		  is nlgn. */
		Ms.Sort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("Sorted Array:");
		Print(arr);
	}
	
	public static void Print(int[] a)
	{
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
