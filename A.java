import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
public class A extends Applet 
{ 
      public static void main(String[] args) 
    { 
        Frame drawLineApplet = new Frame("Draw Line in Applet Window Example"); 
        drawLineApplet.setSize(350, 250); 
        Applet A = new A(); 
        drawLineApplet.add(A); 
        drawLineApplet.setVisible(true); 
        drawLineApplet.addWindowListener(new WindowAdapter() { 
        public void windowClosing(WindowEvent e) {System.exit(0); } 
                                                                                   }); 
    } 
  public void paint(Graphics g) 
  { 
          // Now we tell g to change the font 
         g.setFont(new Font("Arial",Font.BOLD,14)); 
        //Syntax: drawString(String str, int xBaselineLeft, int yBaselineLeft);   
         g.drawString("This is Draw Line Example", 100, 70);   
        // draws a Line 
         g.setColor(Color.blue);  // Now we tell g to change the color 
        //Syntax For:- drawLine(int x1, int y1, int x2, int y2); 
         g.drawLine(90, 135, 90, 180); 
        g.setColor(Color.pink);  // Now we tell g to change the color 
        g.drawLine(0, 0, 100, 100); 
   } 
} 