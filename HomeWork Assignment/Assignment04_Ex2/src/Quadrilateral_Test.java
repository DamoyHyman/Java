
public class Quadrilateral_Test {

	public static void main(String[] args) 
	{
		Quadrilateral q1 = new Quadrilateral();
		q1.getQuadrilateral();
		
		if(q1.isSquare())
		{
			System.out.println("Your Quadrilateral is a square");
		}
		else 
		{
			System.out.println("Your Quadrilateral is a rectangle");
		}

	}

}
