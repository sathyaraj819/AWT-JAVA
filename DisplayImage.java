import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"ajsat2.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 15,15, this);  
  }  
      
  }  