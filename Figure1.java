//*****************************************
//Drawing Shapes Problem 1 Figure 1
//
//By: Monti Karlo Lameg
//*****************************************

import javax.swing.JApplet;
import java.awt.*;

public class Figure1 extends JApplet
{

   public void paint(Graphics page)
   {
      //------------------------------------
      //Draws the Diamond
      //------------------------------------
      page.drawLine(200, 50, 375, 180);
      page.drawLine(200, 50, 25, 180);
      page.drawLine(25, 180, 200, 310);
      page.drawLine(375, 180, 200, 310);
      
      //------------------------------------
      //Draws the Cross
      //------------------------------------
      page.drawLine(25, 180, 375, 180);
      page.drawLine(200, 50, 200, 310);
     
      //------------------------------------
      //Writes Albert Einstein
      //------------------------------------
      page. drawString("--Albert Einstein", 150, 380);
      
      
    }
}