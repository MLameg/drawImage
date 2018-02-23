//*****************************************
//Drawing Shapes Problem 1 Figure 2
//
//By: Monti Karlo Lameg
//*****************************************

import javax.swing.JApplet;
import java.awt.*;

public class Figure2 extends JApplet
{

   public void paint(Graphics page)
   {
      //-----------------------------------
      //Draws Square
      //-----------------------------------
      page.setColor(Color.blue);
      page.drawRect(50, 50, 300, 300);
      
      //-----------------------------------
      //Draws Circle
      //-----------------------------------
      page.setColor(Color.red);
      page.drawOval(50,50, 300, 300);
      
      //-----------------------------------
      //Draws Vertical/Horizontal Lines
      //-----------------------------------
      page.setColor(Color.black);
      page.drawLine(200, 50, 200, 350);
      page.drawLine(50, 200, 350, 200);
      
      //-----------------------------------
      //Draws Solid Yellow Circle
      //-----------------------------------
      page.setColor(Color.yellow);
      page.fillOval(150, 150, 100, 100); 
      
      
      


   }
}