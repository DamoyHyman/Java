import java.util.HashMap;
public class HashMap_Demo 
{
	public static void main(String[] args) 
	{
		String test = "ABACBAS";
		
		System.out.println("First letter ocurrance in " + test + " is: " + firstOccurance(test));
	}

	public static char firstOccurance(String s)
	{
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++)
		{
			if (hashmap.containsKey(s.charAt(i)))
				return s.charAt(i);
			
			hashmap.put(s.charAt(i), 1);
		}
		
		return 0;
	}
}
