
public class Solution {

	public static void main(String[] args) 
	{
		String S = "2-4A0r7-4k";
		//String S = "r";
		System.out.println(solution(S, 3));

	}
	
	public static String solution(String S, int K)
    {
	        StringBuilder sb = new StringBuilder();
	        S = S.toUpperCase();
	        
	        for (int i = S.length() - 1; i >= 0; i--)
	        {
	            if (S.charAt(i) != '-')
	            {
	            	if ((sb.length() % (K + 1)) == K)
	            		sb.append('-');
	            	
	            	sb.append(S.charAt(i));
	            }      
	        }
	        
	        return sb.reverse().toString();
    }

}
