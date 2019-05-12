/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Cat2 extends Thread
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


    // cat
    public void cat2 ()
    {
	for (int i = 0 ; i >= -300 ; i--)
	{
	    fillRect (170 + i, 250, 117, 100, cSkyBlue); //erase

	    fillRect (180 + i, 310, 80, 20, cLightGray); // body
	    fillArc (190 + i, 295, 50, 30, 0, 180, cLightGray);

	    c.setColor (cLightGray);
	    int[] x = {170 + i, 180 + i, 190 + i, 180 + i};  // tail
	    int[] y = {300, 300, 310, 310};
	    c.fillPolygon (x, y, 4);

	    int[] xx = {240 + i, 250 + i, 270 + i, 260 + i};  //neck
	    int[] yy = {310, 300, 300, 310};
	    c.fillPolygon (xx, yy, 4);

	    fillRect (240 + i, 270, 40, 30, cLightGray); //head
	    fillRect (180 + i, 330, 20, 20, cLightGray);   // foot
	    fillRect (240 + i, 330, 20, 20, cLightGray);

	    int[] xa = {240 + i, 250 + i, 260 + i}; //ear
	    int[] ya = {270, 250, 270};
	    c.fillPolygon (xa, ya, 3);

	    int[] xb = {260 + i, 270 + i, 280 + i}; //ear
	    int[] yb = {270, 250, 270};
	    c.fillPolygon (xb, yb, 3);

	    c.setColor (Color.pink);
	    int[] xc = {245 + i, 250 + i, 255 + i};  //ear
	    int[] yc = {270, 260, 270};
	    c.fillPolygon (xc, yc, 3);

	    int[] xd = {265 + i, 270 + i, 275 + i}; //ear
	    int[] yd = {270, 260, 270};
	    c.fillPolygon (xd, yd, 3);

	    fillOval (268 + i, 277, 5, 5, cWhite); //eye
	    fillOval (248 + i, 277, 5, 5, cWhite);
	    drawOval (268 + i, 277, 5, 5, cBlack); //eye
	    drawOval (248 + i, 277, 5, 5, cBlack);

	    drawArc (253 + i, 285, 15, 10, 180, 180, cBlack); // mouth

	    drawLine (245 + i, 290, 235 + i, 285, cBlack); //whiskers
	    drawLine (245 + i, 290, 235 + i, 290, cBlack);
	    drawLine (245 + i, 290, 235 + i, 295, cBlack);

	    drawLine (275 + i, 290, 285 + i, 285, cBlack);
	    drawLine (275 + i, 290, 285 + i, 290, cBlack);
	    drawLine (275 + i, 290, 285 + i, 295, cBlack);


	    try
	    {
		Thread.sleep (5); //delay
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public Cat2 (Console con)
    {
	c = con;
	cat2 ();
    }
}


