
public class Quadrilateral_Test 
{

	public static void main(String[] args) 
	{
		Quadrilateral Q = new Quadrilateral();
		
		System.out.println("Four points of the Quadrilateral #1 is:");
		System.out.println(Q);
		System.out.println("This is a parallelogram.(T/F): " + Q.isParallelogram());
		System.out.println("This is a rectangle.(T/F): " + Q.isRectangle());
		System.out.println("This is a square.(T/F): " + Q.isSquare());
		System.out.println();
		
		Q.setPoint_2(new Point(3,1));
		Q.setPoint_3(new Point(3,2));
		
		System.out.println("Four points of the Quadrilateral #2 is:");
		System.out.println(Q);
		System.out.println("This is a parallelogram.(T/F): " + Q.isParallelogram());
		System.out.println("This is a rectangle.(T/F): " + Q.isRectangle());
		System.out.println("This is a square.(T/F): " + Q.isSquare());
		System.out.println();
		
		Q.setPoint_3(new Point(4,2));
		Q.setPoint_4(new Point(2,2));
		
		System.out.println("Four points of the Quadrilateral #3 is:");
		System.out.println(Q);
		System.out.println("This is a parallelogram.(T/F): " + Q.isParallelogram());
		System.out.println("This is a rectangle.(T/F): " + Q.isRectangle());
		System.out.println("This is a square.(T/F): " + Q.isSquare());
		System.out.println();
		
		Q.setPoint_1(new Point(3,1));
		Q.setPoint_2(new Point(4,1));
		Q.setPoint_3(new Point(4,2));
		Q.setPoint_4(new Point(3,2));
		
		System.out.println("Four points of the Quadrilateral #4 is:");
		System.out.println(Q);
		System.out.println("This is a parallelogram.(T/F): " + Q.isParallelogram());
		System.out.println("This is a rectangle.(T/F): " + Q.isRectangle());
		System.out.println("This is a square.(T/F): " + Q.isSquare());
		System.out.println();
		
	}

}
