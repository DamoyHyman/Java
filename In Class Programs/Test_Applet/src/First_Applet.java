
import java.awt.Graphics;
import javax.swing.JApplet;

public class First_Applet extends JApplet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas)
	{
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 0, 180);
	}
}
