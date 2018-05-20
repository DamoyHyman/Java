/*
 The worst case time complexity for the Merge Sort
 algorithm nlgn
*/
public class MergeSort 
{
	private void Merge(int[] a, int start, int q, int end)
	{
		int n1 = q - start + 1;
		int n2 = end - q;
		
		// Create 2 temp array 
		int[] L = new int[n1], R = new int[n2];
		
		// Copy over to temp arrays
		for(int i = 0; i < n1; i++)
			L[i] = a[start + i];
		
		for(int i = 0; i < n2; i++)
			R[i] = a[q + 1 + i];
		
		/* Merge the temp arrays */
		int i = 0, j = 0;
		
		int k = start;
		while(i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				a[k] = L[i];
				i++;
			}
			
			else
			{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		
		/* Copy remaining elements of L[] if any */
		while(i < n1)
		{
			a[k] = L[i];
			i++;
			k++;
		}
		
		/* Copy remaining elements of R[] if any */
		while(j < n2)
		{
			a[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void Sort(int[] a, int start, int end)
	{
		if (start < end)
		{
			int q = (start + end) / 2;
			Sort(a, start, q);
			Sort(a, q + 1, end);
			Merge(a, start, q, end);
		}
	}
	
}
