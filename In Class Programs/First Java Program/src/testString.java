
public class testString {

	public static void main(String[] args) 
	{
		String text = "Text processing is hard..";
		System.out.println(text);
		int find = text.indexOf("hard");
		System.out.println("The index of \"hard\" is: " + find);
		text = text.substring(0, find) + "easy";
		System.out.println("The entire text with uppercase and replacement of \"hard\": "+ text.toUpperCase());

	}

}
