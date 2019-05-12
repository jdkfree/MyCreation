/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class BackgroundA
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
	c.drawRect (x, y, z, j);
    }


    // background draw
    public void backgroundA ()
    {
	// background
	for (int i = 0 ; i <= 640 ; i++)
	{
	    drawRect (i, 0, i, 500, cLightGray);
	}

	// table
	for (int i = 0 ; i <= 400 ; i++)
	{
	    drawRect (0, 300, i, 200, cLightBrown);
	}

	drawLine (200, 300, 200, 500, cBlack);
	drawArc (150, 325, 50, 50, 90, 180, cBlack);
	drawArc (200, 325, 50, 50, 270, 180, cBlack);

	//cabinet

	for (int i = 0 ; i <= 400 ; i++)
	{
	    drawRect (450, 100, 190, i, cLightBrown);
	}
	drawRect (450, 100, 189, 399, cBlack);   //outline
	for (int i = 0 ; i <= 190 ; i++)
	{
	    drawRect (450, 195, i, 10, cBlack);   //shelves
	    drawRect (450, 295, i, 10, cBlack);
	    drawRect (450, 395, i, 10, cBlack);
	}
	//lights
	for (int i = 0 ; i <= 10 ; i++)
	{
	    drawRect (95, 0, i, 50, cBlack);   // left light
	    drawRect (295, 0, i, 50, cBlack);   //right light
	}

	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawArc (50 + i / 2, 50 + i / 2, 100 - i, 100 - i, 0, 180, cGray);
	    drawArc (250 + i / 2, 50 + i / 2, 100 - i, 100 - i, 0, 180, cGray);
	}



	//others
	for (int i = 0 ; i <= 100 ; i++)
	{
	    drawRect (500, 140, i, 54, cGray);   //pot
	}

	for (int i = 0 ; i <= 10 ; i++)
	{
	    drawRect (490, 147, i, 4, cGray);
	    drawRect (600, 147, i, 4, cGray);
	}
	for (int i = 0 ; i <= 40 ; i++)
	{
	    drawArc (495 + i / 2, 120 + i / 2, 110 - i, 39 - i, 0, 180, cLightGray);
	}
	for (int i = 0 ; i <= 50 ; i++)
	{
	    drawRect (475, 250, i, 44, cTan);   //box 1
	    drawRect (475, 250, i, 9, cBlack);
	}
	for (int i = 0 ; i <= 70 ; i++)
	{
	    drawRect (550, 260, i, 34, cBurgundy);
	}
	for (int i = 0 ; i <= 30 ; i++)
	{
	    drawRect (570, 265, i, 24, cYellow);
	}
	for (int i = 0 ; i <= 50 ; i++)
	{
	    drawRect (500, 450, i, 49, cBrown);
	    drawRect (500, 450, i, 9, cBlue);
	}
	// rat draw commands
	fillRect (330, 250, 71, 50, cLightGray);  //erase
	fillOval (343, 265, 55, 30, cDarkGray);  //body
	fillRect (360, 290, 30, 5, cDarkGray);
	fillOval (330, 270, 30, 17, cDarkGray);  //head
	fillArc (350, 295, 30, 10, 90, 90, cDarkGray);  //feet
	fillArc (375, 295, 30, 10, 90, 90, cDarkGray);
	drawArc (378, 277, 9, 17, 90, 180, cBlack);  //leg
	fillOval (340, 273, 7, 7, cWhite);  // eye
	drawOval (340, 273, 7, 7, cBlack);  // eye
	fillArc (382, 250, 18, 24, 285, 75, cPink);  //tail
	fillArc (382, 250, 16, 22, 285, 75, cLightGray);  //tail

	fillArc (395, 250, 10, 20, 135, 120, cPink);
	fillArc (397, 250, 15, 20, 135, 135, cLightGray);

    }


    public BackgroundA (Console con)
    {
	c = con;
	backgroundA ();
    }
}


