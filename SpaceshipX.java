/*
Justin Freemantle
ICS20 Ms Krasteva
October 25/ 2017
MyCreation
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class SpaceshipX extends Thread
{
    Console c;

    private Color spaceship1;
    private Color spaceship2;
    private Color spaceColor;
    private int delay;
    private int yCoord;

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


    public void redraw ()
    {
	//redraw background
	fillRect (0, 300, 640, 200, cAshphalt); //roads

	fillRect (0, 395, 50, 10, cYellow); //road markers
	fillRect (100, 395, 50, 10, cYellow);
	fillRect (200, 395, 50, 10, cYellow);
	fillRect (300, 395, 50, 10, cYellow);
	fillRect (400, 395, 50, 10, cYellow);
	fillRect (500, 395, 50, 10, cYellow);
	fillRect (600, 395, 50, 10, cYellow);


	fillRect (90, 440, 100, 40, cOrange); //body

	fillArc (90, 415, 80, 50, 0, 180, cOrange); // hood

	fillArc (95, 420, 60, 40, 90, 90, cWhite); // window
	fillArc (105, 420, 60, 40, 0, 90, cWhite);

	fillOval (80, 460, 40, 40, cBlack); //left wheel
	fillOval (85, 465, 30, 30, cWhite);

	fillOval (160, 460, 40, 40, cBlack); //right wheel
	fillOval (165, 465, 30, 30, cWhite);

	fillArc (120, 450, 20, 20, 90, 90, cLightBrown); // crust

	c.setColor (cYellow);
	int[] x1 = {120, 130, 140}; // pizza
	int[] y2 = {460, 450, 470, 310};
	c.fillPolygon (x1, y2, 3);

	fillOval (136, 465, 2, 2, cRed); //pepperoni
	fillOval (128, 460, 2, 2, cRed);
	fillOval (130, 455, 2, 2, cRed);

	c.setColor (cRed);
	c.setFont (new Font ("Serif", Font.PLAIN, 12));
	c.drawString ("Pizza", 90, 455); //text
	c.drawString ("Planet", 140, 460);

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
	drawArc (290, 300, 40, 40, 270, 90, cBlack);
    }


    // spaceship
    public void spaceship (Color k, Color j, int y, int t)
    {
	synchronized (c)
	{
	    for (int i = 0 ; i <= 760 ; i++)
	    {
		fillRect (0, 0, 640, 300, cSkyBlue); //sky
		fillRect (-50, 50, 100, 250, cLightGray); // buildings
		fillRect (51, 100, 100, 50, cBurgundy);
		fillRect (201, 0, 149, 300, cDarkGray);
		fillRect (350, 100, 100, 200, cBurgundy);
		fillRect (500, 150, 100, 150, cDarkGray);
		fillRect (451, 250, 100, 50, cLightGray);
		fillRect (600, 150, 100, 150, cBurgundy);
		fillRect (51, 150, 150, 150, cLightBrown);


		//fillRect (520 - i, 20 + y, 112, 60, j); //erase
		fillArc (640 - i, 20 + y, 110, 80, 0, 180, k); //body
		fillArc (650 - i, 40 + y, 90, 40, 180, 180, k);
		drawLine (640 - i, 60 + y, 750 - i, 60 + y, cBlack);
		drawLine (640 - i, 59 + y, 660 - i, 49 + y, cBlack);
		drawLine (660 - i, 49 + y, 680 - i, 59 + y, cBlack);
		drawLine (680 - i, 59 + y, 700 - i, 49 + y, cBlack);
		drawLine (700 - i, 49 + y, 720 - i, 59 + y, cBlack);
		drawLine (720 - i, 59 + y, 740 - i, 49 + y, cBlack);
		drawLine (740 - i, 49 + y, 748 - i, 54 + y, cBlack);
		fillRect (660 - i, 35 + y, 30, 10, cWhite); // window
		drawRect (660 - i, 35 + y, 30, 10, cBlack);
		fillRect (700 - i, 35 + y, 30, 10, cWhite);
		drawRect (700 - i, 35 + y, 30, 10, cBlack);
		fillOval (665 - i, 65 + y, 5, 5, cYellow); // light
		fillOval (678 - i, 68 + y, 5, 5, cYellow);
		fillOval (693 - i, 70 + y, 5, 5, cYellow);
		fillOval (708 - i, 68 + y, 5, 5, cYellow);
		fillOval (722 - i, 65 + y, 5, 5, cYellow);

		try
		{
		    Thread.sleep (delay);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public SpaceshipX (Console con, int t)
    {
	yCoord = 0;
	c = con;
	spaceship1 = (cDarkGreen);
	spaceship2 = (cPurple);
	delay = t;

    }


    public SpaceshipX (Console con, Color n, Color z, Color g, int t)
    {
	yCoord = 70;
	c = con;
	spaceship1 = n;
	spaceship2 = z;
	delay = t + 10;
    }


    public SpaceshipX (Console con, Color s, Color f, int t)
    {
	yCoord = 140;
	c = con;
	spaceship1 = s;
	spaceship2 = f;
	delay = t + 20;
    }


    public void run ()
    {
	redraw ();
	spaceship (spaceship1, spaceColor, yCoord, delay);
    }
}


