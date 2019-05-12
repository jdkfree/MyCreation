/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Rat extends Thread
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

    Color cPink = new Color (255, 128, 255);


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


    // rat
    public void rat ()
    {
	try //delay (waits for dough to fall
	{
	    Thread.sleep (10000);
	}
	catch (Exception e)
	{
	}

	for (int i = 0 ; i <= 400 ; i++)
	{

	    fillRect (330 - i, 250, 71, 50, cLightGray); //erase
	    fillOval (343 - i, 265, 55, 30, cDarkGray); //body
	    fillRect (360 - i, 290, 30, 5, cDarkGray);
	    fillOval (330 - i, 270, 30, 17, cDarkGray); //head
	    fillArc (350 - i, 295, 30, 10, 90, 90, cDarkGray); //feet
	    fillArc (375 - i, 295, 30, 10, 90, 90, cDarkGray);
	    drawArc (378 - i, 277, 9, 17, 90, 180, cBlack); //leg
	    fillOval (340 - i, 273, 7, 7, cWhite); // eye
	    drawOval (340 - i, 273, 7, 7, cBlack); // eye
	    drawLine (334 - i, 274, 334 - i, 282, cBlack); //nose

	    fillArc (382 - i, 250, 18, 24, 285, 75, cPink); //tail
	    fillArc (382 - i, 250, 16, 22, 285, 75, cLightGray); //tail

	    fillArc (395 - i, 250, 10, 20, 135, 120, cPink);
	    fillArc (397 - i, 250, 15, 20, 135, 135, cLightGray);

	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public Rat (Console con)
    {
	c = con;

    }


    public void run ()
    {
	rat ();
    }
}


