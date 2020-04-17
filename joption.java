
package swingdemo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class joption {
    // we can use constructor 
    /*
    joption()
    {
        JOptionPane.showMessageDialog(null, "Cyber security","Aleart",JOptionPane.WARNING_MESSAGE);
    }
    and initialize the class in main method 
    
    */
    

    
    
    public static void main(String[] args) {
      
        ImageIcon igm = new ImageIcon("whatapp.png");
       
        
      JOptionPane.showMessageDialog(null, "hello world");
      // showMessageDialoge is static method 
      // that's why we need it's class name to allocate it 
      // showMessage dialoge have parameteraize method 
      JOptionPane.showMessageDialog(null, "Cyber security","Aleart",JOptionPane.WARNING_MESSAGE);
      
     // JOptionPane.showMessageDialog(null,"what's app","title",JOptionPane.PROPERTIES, icon);
     
    }
    
}
