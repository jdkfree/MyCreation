/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Pizza extends Thread
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


    // pizza
    public void pizza ()
    {
	for (int i = 0 ; i <= 40 ; i++)
	{

	    fillRect (267, 281 - i, 30, 10, cSkyBlue); //erase
	    fillRect (267, 280 - i, 30, 10, cBlack); //pizza
	    c.setColor (cWhite);
	    c.setFont (new Font ("Serif", Font.PLAIN, 12));
	    c.drawString ("P P", 275, 290 - i);

	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public void pizza2 ()
    {
	for (int i = 0 ; i <= 130 ; i++)
	{

	    fillRect (266 + i, 240, 30, 10, cSkyBlue); //erase
	    fillRect (267 + i, 240, 30, 10, cBlack); //pizza
	    c.setColor (cWhite);
	    c.setFont (new Font ("Serif", Font.PLAIN, 12));
	    c.drawString ("P P", 275 + i, 250);

	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception e)
	{
	}
	drawLine (397, 240, 379, 222, cBlack); //lid
    }


    public Pizza (Console con)
    {
	c = con;
	pizza ();
	pizza2 ();
    }
}



