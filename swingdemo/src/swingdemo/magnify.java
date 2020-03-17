package swingdemo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;

import javax.swing.JFrame;

public class magnify  extends JFrame{
	
	magnify m; 
	 Image i;
	 magnify( myproject1 pt) 
	    { 
	        // create a frame 
	        super("pt"); 
	  
	        // set size of frame 
	        setSize(300, 220); 
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        show(); 
	  
	        // function to magnify the image 
	        work( pt); 
	    } 

	 
	 public void work( myproject1 pt) 
	    { 
	        try { 
	            // create a robot 
	            Robot r = new Robot(); 
	  
	            // while the frame is visible 
	            while (isVisible()) { 
	                // get the position of mouse 
	                Point p = pt.l_1.getLocation(); 
	  
	                // create a screen capture around the mouse pointer 
	                i = r.createScreenCapture(new Rectangle((int)p.getX() - 30, 
	                                                        (int)p.getY() - 30, 150, 150)); 
	  
	                
	                repaint(); 
	            }
	            
	        }
	        catch (Exception e) { 
	            System.err.println(e.getMessage()); 
	        } 
	    }
	 public void paint(Graphics g) 
	    { 
	  
	        
	        g.drawImage(i, 0, 0, 300, 300, this); 
	    } 
}

