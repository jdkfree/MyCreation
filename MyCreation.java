/*
Justin Freemantle 
ICS20 Ms Krasteva
October 25 2017
This code will display  my MyCreation, an animation about a pizza delivery. A 
rat makes the pizza and the delivery car is on the road when it gets hit by an
alien spaceship, causing it to lose control and roll backwards. The impact causes 
a nearby bike to start rolling, and the delivery boy must chase after it to deliver
the pizza. He gets to the house and throws the pizza on the doorstep.
*/

//import methods
import java.awt.*;
import hsa.Console;


//MyCreation class
public class MyCreation
{
    //declares console
    Console c;
    public MyCreation ()
    {
	c = new Console ("My Creation"); 
    }


    public void backgrounda ()
    {
	BackgroundA a = new BackgroundA (c); //calls BackGroundA
    }


    public void titleA ()
    {
	TitleA a = new TitleA (c); // calls TitleA
    }


    public void titleB ()
    {
	TitleB a = new TitleB (c); // calls TitleB
    }
    
    public void titleC ()
    {
	TitleC a = new TitleC (c); // calls TitleB
    }




    public void backgroundb ()
    {
	BackgroundB a = new BackgroundB (c); // calls BackGroundB
    }


    public void backgroundc ()
    {
	BackgroundC a = new BackgroundC (c); // calls Background C
    }


    public void car ()
    {
	Car a = new Car (c); // calls car
	a.start ();

	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public void car2 ()
    {
	Car2 a = new Car2 (c); //calls Car2
	a.start ();

	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public void deliveryBoy ()
    {
	DeliveryBoy a = new DeliveryBoy (c); // calls DeliveryBoy
	a.start ();
	try
	{
	    a.join ();// waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}

    }

    public void spaceship ()
    {
	SpaceshipX a1 = new SpaceshipX (c, 2); // calls the first spaceship method
	a1.start ();
	//calls the overloaded spaceship method
	SpaceshipX l2 = new SpaceshipX (c, Color.orange, Color.red, Color.black, 0);
	l2.start ();
	// calls the overloaded spaceship method
	SpaceshipX l3 = new SpaceshipX (c, Color.pink, Color.yellow, 0);
	l3.start ();
	try
	{
	// waits for previous method to finish
	    l3.join ();
	    a1.join ();
	    l2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void cat ()
    {
	Cat a = new Cat (c); //calls Cat
	a.start ();
	
	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}

    }


    public void cat2 ()
    {
	Cat2 a = new Cat2 (c); // calls Cat2
	a.start ();
	
	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}

    }


    public void bicycle ()
    {
	Bicycle a = new Bicycle (c); // calls Bicycle 
	a.start ();
	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}

    }


    public void deliveryBoy2 ()
    {
	DeliveryBoy2 a = new DeliveryBoy2 (c); // calls DeliveryBoy2
	a.start ();

	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public void deliveryBoy3 ()
    {
	DeliveryBoy3 a = new DeliveryBoy3 (c); // calls DeliveryBoy3
	a.start ();

	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public void pizza ()
    {
	Pizza a = new Pizza (c); //calls Pizza
	a.start ();

	try
	{

	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public void pizzaDough ()
    {
	PizzaDough a = new PizzaDough (c); //calls PizzaDough
	a.start ();
    }


    public void rat ()
    {
	Rat a = new Rat (c); //calls Rat
	a.start ();

	try
	{
	    a.join (); // waits for previous method to finish
	}
	catch (InterruptedException e)
	{
	}
    }


    public static void main (String[] args)  //main method
    {
	MyCreation t = new MyCreation ();
	t.titleA ();
	t.backgrounda ();
	t.pizzaDough ();
	t.rat ();
	t.backgroundb ();
	t.car ();
	t.titleB ();
	t.spaceship ();
	t.car2 ();
	t.bicycle ();
	t.deliveryBoy ();
	t.backgroundc ();
	t.deliveryBoy2 ();
	t.pizza ();
	t.deliveryBoy3 ();
	t.cat ();
	t.cat2 ();
	t.titleC ();

    }
}

