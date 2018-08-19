
import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
public class partial  extends java.applet.Applet{
	

	    public void paint(Graphics g) {
	    	// for square
	        g.setColor(Color.red);
	        g.fillRect(20,40,40,20);
	        g.setColor(Color.black);
	        g.fillRect(20, 60, 40, 20);
	        
	        // for rectangle
	        g.setColor(Color.yellow);
	        g.fillRect(100,40,100,20);
	        g.setColor(Color.green);
	        g.fillRect(100,60,100,20);
	        g.setColor(Color.blue);
	        g.fillRect(100, 80, 100, 20);
		       	       
	        
	    }

}