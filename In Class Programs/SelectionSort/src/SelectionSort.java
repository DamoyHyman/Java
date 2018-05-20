public class SelectionSort 
{

	public static void main(String[] args) 
	{
		int[] array = { 3, 7, 5, 2, 4, 8, 0, 1, 11, 9, -1};
		
		System.out.print("Before sorting: ");
		Display(array);
		
		selectionSort(array);
		System.out.print("After sorting: ");
		Display(array);

	}
	
	// Find index of the smallest value in the array and return its index
	public static int findMin(int []a, int begin)
	{
		int min = a[begin];
		int indexOfMin = begin;
		
		for(int i = begin + 1; i < a.length; i++ )
		{
			if (a[i] < min)
			{
				min = a[i];
				indexOfMin = i;
				
			}
		}
	
		return indexOfMin;
	}
	
	// Swap values in the array
	public static void swap(int[] a, int i, int j )
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			int minIndex = findMin(a, i);
			swap(a, minIndex, i);
		}
	}
	
	public static void Display(int[] a)
	{
		System.out.print("[");
		for (int i = 0; i < a.length; i++)
		{
			if (i < a.length-1)
			System.out.print(a[i] + ", ");
			
			else
				System.out.print(a[i] + "");
		}
		System.out.println("]");
	}

}
