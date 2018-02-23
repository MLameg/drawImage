//*****************************************
//Drawing Shapes Problem 1 Figure 3
//
//By: Monti Karlo Lameg
//*****************************************

import javax.swing.JApplet;
import java.awt.*;

public class Figure3 extends JApplet
{

   public void paint(Graphics page)
   {
      //-----------------------------------
      //Draws Vertical/Horizontal Lines
      //-----------------------------------
      page.setColor(Color.black);
      page.drawLine(200, 50, 200, 230);
      page.drawLine(100, 140, 300, 140);
      
      //-----------------------------------
      //Draws Green Oval
      //-----------------------------------
      page.setColor(Color.green);
      page.drawOval(180,50, 40, 180);
      
      //-----------------------------------
      //Draws Yellow Vert/Horz Rectangle
      //-----------------------------------
      page.setColor(Color.yellow);
      page.drawRect(179, 50, 40, 181);
      page.drawRect(100, 100, 200, 80); 
      
      //-----------------------------------
      //Draws Pink Arc
      //-----------------------------------
      page.setColor(Color.pink);
      page.drawArc(100, 110, 200, 70, 180, 180);  
      
      //-----------------------------------
      //Draws Red Arc
      //-----------------------------------
      page.setColor(Color.red);
      page.drawArc(100, 50, 200, 180, 0, 180);
       
      //-----------------------------------
      //Draws Diagonal Lines
      //-----------------------------------
      page.setColor(Color.black);
      page.drawLine(80, 210, 60, 230);
      page.drawLine(80, 210, 220, 350);
      page.drawLine(60, 230, 220, 390);
      
      
      

      }
}