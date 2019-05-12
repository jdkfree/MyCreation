/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class DeliveryBoy3 extends Thread
{
    Console c;

    Color cRed = Color.red;
    Color cBlue = Color.blue;
    Color cWhite = Color.white;
    Color cred = Color.red;
    Color cGray = new Color (190, 190, 190);
    Color cLightGray = new Color (225, 225, 225);
    Color cDarkGray = new Color (100, 100, 100);
    Color cLightBlue = new Color (58, 147, 218);
    Color cDarkBlue = new Color (6, 41, 164);
    Color cYellow = Color.yellow;
    Color cBlack = Color.black;
    Color cBurgundy = new Color (165, 45, 48);
    Color cTan = new Color (241, 167, 99);
    Color cDarkGreen = new Color (11, 122, 7);
    Color cLightBrown = new Color (160, 101, 35);
    Color cOrange = Color.orange;
    Color cLightYellow = new Color (255, 255, 130);
    Color cSkyBlue = new Color (139, 235, 245);
    Color cAshphalt = new Color (70, 70, 70);
    Color cPurple = new Color (118, 33, 154);
    Color cOrangeYellow = new Color (254, 224, 18);
    Color cBrown = new Color (119, 72, 26);
    Color cGreen = new Color (3, 241, 3);



    //overloaded draw methods
    public void drawArc (int x, int y, int z, int h, int i, int j, Color k)
    {
	c.setColor (k);
	c.drawArc (x, y, z, h, i, j);
    }


    public void fillArc (int x, int y, int z, int h, int i, int j, Color k)
    {
	c.setColor (k);
	c.fillArc (x, y, z, h, i, j);
    }


    public void drawOval (int x, int y, int z, int j, Color k)
    {
	c.setColor (k);
	c.drawOval (x, y, z, j);
    }


    public void fillOval (int x, int y, int z, int j, Color k)
    {
	c.setColor (k);
	c.fillOval (x, y, z, j);
    }


    public void drawRect (int x, int y, int z, int j, Color k)
    {
	c.setColor (k);
	c.drawRect (x, y, z, j);
    }


    public void fillRect (int x, int y, int z, int j, Color k)
    {
	c.setColor (k);
	c.fillRect (x, y, z, j);
    }


    public void drawLine (int x, int y, int z, int j, Color k)
    {
	c.setColor (k);
	c.drawLine (x, y, z, j);
    }


    // delivery boy
    public void deliveryBoy3 ()
    {
	for (int i = 0 ; i <= 300 ; i++)
	{
	    fillRect (220 - i, 270, 78, 80, cSkyBlue); // erase
	    fillRect (235 - i, 330, 10, 20, cLightBrown); // pants
	    fillRect (250 - i, 330, 10, 20, cLightBrown);
	    fillRect (235 - i, 300, 25, 30, cGreen); // shirt
	    fillOval (240 - i, 308, 15, 15, cOrange); // Logo
	    fillOval (235 - i, 275, 25, 25, cTan); //head
	    fillRect (260 - i, 300, 25, 5, cGreen); //arm
	    fillRect (280 - i, 290, 5, 15, cGreen);
	    drawArc (240 - i, 282, 6, 4, 20, 200, cBlack); //eye
	    drawArc (250 - i, 282, 6, 4, 20, 200, cBlack);
	    drawArc (245 - i, 290, 6, 6, 180, 180, cBlack); // mouth

	    drawLine (240 - i, 280, 245 - i, 277, cBlack); //eyebrow
	    drawLine (255 - i, 280, 250 - i, 277, cBlack);

	    c.setColor (cGreen);
	    int[] x = {220 - i, 235 - i, 235 - i, 225 - i};  // left arm
	    int[] y = {330, 300, 310, 330};
	    c.fillPolygon (x, y, 4);

	    c.setColor (cBlack);
	    c.drawString ("P", 245 - i, 320);

	    try //delay
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	}


    }


    public DeliveryBoy3 (Console con)
    {
	c = con;
	deliveryBoy3 ();
    }
}


