
public class Sts {

	public static void main(String[] args) 
	{
		
		String A = "abcdf";
		String B = "cdfabcdfabcdfabcf";
		System.out.println(solution(A,B));
	}

	public static int solution(String A, String B) 
	{
		String newS = A;
		int state = 1,  newS_index = A.indexOf(B.charAt(0)); // Find the index of the first letter of B in A (if A contain B's first character)
		
		if (newS_index >= 0) // Character found
		{
			for (int i = 0; i < B.length(); i++)
			{
				if (B.charAt(i) == newS.charAt(newS_index)) // Characters are the same
				{
					newS_index++; // Advance newS's index
				}
				else // Characters are not the same
					return -1;
				
				 if(newS_index == newS.length() && i < B.length() - 1)
				{
					newS += A; // append A to newS
					state++;
				}
			}
		}
		
		else // Character not found
			return -1;
		
		return state;
    }
	
}