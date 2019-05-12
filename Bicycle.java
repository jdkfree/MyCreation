/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Bicycle extends Thread
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


    // bicycle
    public void bicycle ()
    {
	for (int i = 0 ; i <= 440 ; i++)
	{
	    //bicycle
	    fillRect (199 + i, 310, 130, 81, cAshphalt); //erase
	    c.setColor (cBlack);
	    c.drawOval (200 + i, 350, 40, 40); //back wheel
	    c.drawOval (290 + i, 350, 40, 40); //front wheel
	    c.drawLine (220 + i, 350, 220 + i, 390); //back spokes
	    c.drawLine (200 + i, 370, 330 + i, 370);
	    c.drawLine (234 + i, 356, 206 + i, 384);
	    c.drawLine (206 + i, 356, 234 + i, 384);
	    c.drawLine (310 + i, 310, 310 + i, 390); //front spokes
	    c.drawLine (296 + i, 356, 324 + i, 384);
	    c.drawLine (324 + i, 356, 296 + i, 384);
	    c.drawLine (227 + i, 352, 240 + i, 320); //frame
	    c.drawLine (240 + i, 320, 310 + i, 350);
	    c.fillRect (290 + i, 310, 20, 10); //handle
	    c.fillRect (230 + i, 315, 20, 5); // seat
	    c.drawLine (260 + i, 355, 260 + i, 385); // pedal
	    c.fillRect (260 + i, 355, 10, 5);
	    c.fillRect (250 + i, 380, 10, 5);
	    c.drawArc (290 + i, 300, 40, 40, 270, 90);

	    try
	    {
		Thread.sleep (33);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public Bicycle (Console con)
    {
	c = con;
	bicycle ();
    }
}


