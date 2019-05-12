/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class BackgroundB
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


    // background draw
    public void backgroundB ()
    {
	for (int i = 0 ; i <= 640 ; i++)
	{
	    drawLine (i, 0, i, 400, cSkyBlue); //sky
	}
	for (int i = 0 ; i <= 640 ; i++)
	{
	    drawRect (0, 300, i, 200, cAshphalt); //roads
	}
	for (int i = 0 ; i <= 50 ; i++)
	{
	    drawRect (0, 395, i, 10, cYellow); //road markers
	    drawRect (100, 395, i, 10, cYellow);
	    drawRect (200, 395, i, 10, cYellow);
	    drawRect (300, 395, i, 10, cYellow);
	    drawRect (400, 395, i, 10, cYellow);
	    drawRect (500, 395, i, 10, cYellow);
	    drawRect (600, 395, i, 10, cYellow);
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (-50, 50, i, 249, cLightGray); // buildings
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (51, 100, i, 50, cBurgundy);
	}
	for (int i = 0 ; i <= 148 ; i++)
	{
	    drawRect (201, 0, i, 299, cDarkGray);
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (350, 100, i, 199, cBurgundy);
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (500, 150, i, 149, cDarkGray);
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (451, 250, i, 49, cLightGray);
	}
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (600, 150, i, 149, cBurgundy);
	}
	for (int i = 0 ; i <= 150 ; i++)
	{
	    drawRect (51, 150, i, 149, cLightBrown);
	}

	//bicycle
	c.setColor (cBlack);
	c.drawOval (200, 350, 40, 40); //back wheel
	c.drawOval (290, 350, 40, 40); //front wheel
	c.drawLine (220, 350, 220, 390); //back spokes
	c.drawLine (200, 370, 330, 370);
	c.drawLine (234, 356, 206, 384);
	c.drawLine (206, 356, 234, 384);
	c.drawLine (310, 310, 310, 390); //front spokes
	c.drawLine (296, 356, 324, 384);
	c.drawLine (324, 356, 296, 384);
	c.drawLine (227, 352, 240, 320); //frame
	c.drawLine (240, 320, 310, 350);
	c.fillRect (290, 310, 20, 10); //handle
	c.fillRect (230, 315, 20, 5); // seat
	c.drawLine (260, 355, 260, 385); // pedal
	c.fillRect (260, 355, 10, 5);
	c.fillRect (250, 380, 10, 5);
	c.drawArc (290, 300, 40, 40, 270, 90);
    }


    public BackgroundB (Console con)
    {
	c = con;
	backgroundB ();
    }
}


