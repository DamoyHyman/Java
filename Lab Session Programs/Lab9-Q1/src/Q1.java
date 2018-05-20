public class Q1
{
	public static void main(String[] args) 
	{
		int arr[] = {6, 5, 1, 3, 8, 4, 7, 9, 2};
		QuickSort QS = new QuickSort();
		
		System.out.println("Given Array:");
		Print(arr);
		
		/*Worst case time complexity for the Quick Sort algorithm 
		  is n*n (n^2). */
		QS.Sort(arr, 0, (arr.length) - 1);
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
