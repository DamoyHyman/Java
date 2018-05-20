import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class Olympic extends JApplet 
{
	public void paint(Graphics canvas) 
	{
		canvas.setColor(Color.yellow);
		canvas.drawOval(45, 40, 90, 70);
		
		canvas.setColor(Color.green);
		canvas.drawOval(105, 40, 90, 70);
		
		canvas.setColor(Color.orange);
		canvas.drawOval(165, 40, 90, 70);
		
		canvas.setColor(Color.black);
		canvas.drawOval(85, 85, 90, 70);
		
		canvas.setColor(Color.black);
		canvas.drawOval(145, 85, 90, 70);
		
		
	
		
		//canvas.drawOval(40, 40, 100, 50);
		//canvas.drawOval(40, 40, 100, 50);

	}

}
