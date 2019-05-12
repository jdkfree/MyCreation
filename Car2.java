/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Car2 extends Thread
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


    //car
    public void car2 ()
    {

	for (int i = 0 ; i <= 200 ; i++)
	{
	    fillRect (81 - i, 415, 130, 90, cAshphalt); //erase
	    fillRect (90 - i, 440, 100, 40, cOrange); //body

	    fillArc (90 - i, 415, 80, 50, 0, 180, cOrange); // hood

	    fillArc (95 - i, 420, 60, 40, 90, 90, cWhite); // window
	    fillArc (105 - i, 420, 60, 40, 0, 90, cWhite);

	    fillOval (80 - i, 460, 40, 40, cBlack); //left wheel
	    fillOval (85 - i, 465, 30, 30, cWhite);

	    fillOval (160 - i, 460, 40, 40, cBlack); //right wheel
	    fillOval (165 - i, 465, 30, 30, cWhite);

	    fillArc (120 - i, 450, 20, 20, 90, 90, cLightBrown); // crust

	    c.setColor (cYellow);
	    int[] x1 = {120 - i, 130 - i, 140 - i}; // pizza
	    int[] y2 = {460, 450, 470, 310};
	    c.fillPolygon (x1, y2, 3);

	    fillOval (136 - i, 465, 2, 2, cRed); //pepperoni
	    fillOval (128 - i, 460, 2, 2, cRed);
	    fillOval (130 - i, 455, 2, 2, cRed);
	    
	    c.setColor (Color.red); 
	    c.drawString ("Pizza", 90 - i, 455);
	    c.drawString ("Planet", 140  - i, 460);

	    try
	    {
		Thread.sleep (33);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public Car2 (Console con)
    {
	c = con;
	car2 ();
    }
}


