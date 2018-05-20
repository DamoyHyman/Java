public class DimensionDemo {

	public static void main(String[] args) 
	{
		
		System.out.println("1 feet = " + DimensionConverter.convertFeetToinches(1) + " inches" );
		System.out.println("12 inches = "  + DimensionConverter.convertInchesToFeet(12) + " feet" );
		
		System.exit(0);

	}

}
