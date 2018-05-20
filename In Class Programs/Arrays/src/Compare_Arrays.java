public class Compare_Arrays 
{

	public static void main(String[] args) 
	{
		int [] array1 = new int[10];
		int [] array2 = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			array1[i] = i*i;
			array2[i] = i*i;
		}
		
		System.out.print("Array 1 :[ ");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(array1[i] + ",");
		}
		System.out.println("]");
		
		System.out.print("Array 2 :[ ");
		for (int i = 0; i < 10; i++)
		{
			System.out.print(array2[i] + ",");
		}
		System.out.println("]");
		
		if (CompareArray(array1, array2))
		{
			System.out.println("Both arrays are equal.");
		}
		else
			System.out.println("Both are not equal.");
		
		 
	}
	
public static boolean CompareArray(int[] a, int[] b)
{
    if (a.length != b.length)
		return false;
		
	else
	{
		int n = a.length;
		int count = 0;
			
		while (count < n)
		{
			if(a[count] != b[count])
				return false;
				
			count++;
		}
		
		return true;
	}
		
}
	
}

