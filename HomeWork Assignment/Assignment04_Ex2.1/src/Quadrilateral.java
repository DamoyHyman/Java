public class Quadrilateral 
{
   private Point P1, P2, P3, P4;
   
   // Default Constructor
   public Quadrilateral()
   {
	   P1 = new Point(1,1);
	   P2 = new Point(2,1);
	   P3 = new Point(2,2);
	   P4 = new Point(1,2);
   }
   
   // Copy Constructor
   public Quadrilateral(Point newP1, Point newP2, Point newP3, Point newP4)
   {
	   P1 = new Point(newP1.getX(), newP1.getY());
	   P2 = new Point(newP2.getX(), newP2.getY());
	   P3 = new Point(newP3.getX(), newP3.getY());
	   P4 = new Point(newP4.getX(), newP4.getY());
   }
   
   // Mutators
   public void setPoint_1(Point newP)
   {
	   P1.setX(newP.getX());
	   P1.setY(newP.getY());
   }
   
   public void setPoint_2(Point newP)
   {
	   P2.setX(newP.getX());
	   P2.setY(newP.getY());
   }
   
   public void setPoint_3(Point newP)
   {
	   P3.setX(newP.getX());
	   P3.setY(newP.getY());
   }
   
   public void setPoint_4(Point newP)
   {
	   P4.setX(newP.getX());
	   P4.setY(newP.getY());
   }
   
   // Accessors
   public Point getPoint_1()
   {
	   return P1;
   }
   
   public Point getPoint_2()
   {
	   return P2;
   }
   
   public Point getPoint_3()
   {
	   return P3;
   }
   
   public Point getPoint_4()
   {
	   return P4;
   }
   
   // Class Methods
   public boolean isParallelogram() 
   {
	   // get the distances/length
	  double disP1_P2 = Math.pow(P2.getX() - P1.getX(), 2.0) + Math.pow(P2.getY() - P1.getY(), 2.0);
	  double disP2_P3 = Math.pow(P3.getX() - P2.getX(), 2.0) + Math.pow(P3.getY() - P2.getY(), 2.0);
	  double disP3_P4 = Math.pow(P4.getX() - P3.getX(), 2.0) + Math.pow(P4.getY() - P3.getY(), 2.0);
	  double disP4_P1 = Math.pow(P1.getX() - P4.getX(), 2.0) + Math.pow(P1.getY() - P4.getY(), 2.0);
	  
	  if (disP1_P2 != disP3_P4 || disP2_P3 != disP4_P1)
		  return false;
	  
	  // get mid point
	  double mp1_3x = (P1.getX() + P3.getX()) / 2;
	  double mp1_3y = (P1.getY() + P3.getY()) / 2;
	  double mp2_4x = (P2.getX() + P4.getX()) / 2;
	  double mp2_4y = (P2.getY() + P4.getY()) / 2;
	  
	  if (mp1_3x != mp2_4x || mp1_3y != mp2_4y)
		  return false;
	  
	  return true;
   }
   
   public boolean isRectangle()
   {
	   if (isParallelogram())
	   {
		   double disP1_P3 = Math.pow(P3.getX() - P1.getX(), 2.0) + Math.pow(P3.getY() - P1.getY(), 2.0);
		   double disP2_P4 = Math.pow(P4.getX() - P2.getX(), 2.0) + Math.pow(P4.getY() - P2.getY(), 2.0);
		   
		   if (disP1_P3 != disP2_P4)
			   return false;
		   
		   return true;
	   }
	   
	   else
		   return false;
   }
   
   public boolean isSquare()
   {
	   if (isRectangle())
	   {
		   double disP1_P2 = Math.pow(P2.getX() - P1.getX(), 2.0) + Math.pow(P2.getY() - P1.getY(), 2.0);
		   double disP2_P3 = Math.pow(P3.getX() - P2.getX(), 2.0) + Math.pow(P3.getY() - P2.getY(), 2.0);
		   
		   if (disP1_P2 != disP2_P3)
			   return false;
		   
		   return true;
	   }
	   
	   else
		   return false;
   }
   
   public String toString() 
   {
	   return "Point 1: " + P1 + "\n" + "Point 2: " + P2 + "\n"
			   + "Point 3: " + P3 + "\n" + "Point 4: " + P4;
   }
}

