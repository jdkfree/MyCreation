/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class DeliveryBoy extends Thread
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
    public void deliveryBoy ()
    {
	for (int i = 0 ; i <= 710 ; i++)
	{
	    fillRect (-71 + i, 425, 73, 75, cAshphalt); //erase
	    fillRect (-55 + i, 480, 10, 20, cLightBrown); // pants
	    fillRect (-40 + i, 480, 10, 20, cLightBrown);
	    fillRect (-55 + i, 450, 25, 30, cGreen); // shirt
	    fillOval (-50 + i, 458, 15, 15, cOrange); // Logo
	    fillOval (-55 + i, 425, 25, 25, cTan); //head
	    fillRect (-30 + i, 450, 25, 5, cGreen); //arm
	    fillRect (-10 + i, 440, 5, 15, cGreen);
	    fillRect (-23 + i, 430, 30, 10, cBlack); //pizza
	    drawArc (-50 + i, 432, 6, 4, 20, 200, cBlack); //eye
	    drawArc (-40 + i, 432, 6, 4, 20, 200, cBlack);
	    drawArc (-45 + i, 440, 6, 6, 180, 180, cBlack); // mouth

	    drawLine (-50 + i, 430, -45 + i, 427, cBlack); //eyebrow
	    drawLine (-35 + i, 430, -40 + i, 427, cBlack);

	    c.setColor (cGreen);
	    int[] x = { - 70 + i, -55 + i, -55 + i, -65 + i}; // left arm
	    int[] y = {480, 450, 460, 480};
	    c.fillPolygon (x, y, 4);

	    c.setColor (cWhite);
	    c.drawString ("P P", -15 + i, 440);

	    c.setColor (cBlack);
	    c.drawString ("P", -45 + i, 470);

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public DeliveryBoy (Console con)
    {
	c = con;
	deliveryBoy ();
    }
}


