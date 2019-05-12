/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class BackgroundC
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


    // background draw
    public void backgroundC ()
    {
	for (int i = 0 ; i <= 640 ; i++)
	{
	    drawRect (0, i, 640, i, cSkyBlue); //sky
	}

	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawOval (-50 + i / 2, -50 + i / 2, 100 - i, 100 - i, cYellow); // sun
	}

	for (int i = 0 ; i <= 150 ; i++)
	{
	    drawRect (0, i + 350, 640, i + 350, cGreen); //grass
	}

	for (int i = 0 ; i <= 200 ; i++)
	{
	    drawRect (450, 0, i, 349, cBurgundy); //house
	}

	for (int i = 0 ; i <= 99 ; i++)
	{
	    drawRect (300, 300, i, 49, cDarkGray); //steps
	    drawRect (350, 250, i, 99, cDarkGray);
	}

	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (500, 100, i, i, cWhite); //grass
	}
	drawRect (500, 100, 100, 100, cBlack);
	drawLine (550, 100, 550, 200, cBlack);
	drawLine (500, 150, 600, 150, cBlack);


    }


    public BackgroundC (Console con)
    {
	c = con;
	backgroundC ();
    }
}


