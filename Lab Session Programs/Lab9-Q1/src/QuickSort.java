/*Worst case time complexity for the Quick Sort algorithm 
 is n*n (n^2). */
public class QuickSort 
{
	private void Swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private int partition(int[] a, int low, int high)
	{
		int pivot = a[high];
		int index = (low - 1);
		
		for (int i = low; i <= high - 1; i++)
		{
			if (a[i] <= pivot)
			{
				index++;
				Swap(a, i, index);
			}
		}
		
		Swap(a, index + 1, high);
		return (index + 1);
	}
	
	public void Sort(int[] a, int low, int high)
	{
		if(low < high)
		{
			int p = partition(a, low, high);
			Sort(a, low, p - 1);
			Sort(a, p + 1, high);
		}
		
	}

}
