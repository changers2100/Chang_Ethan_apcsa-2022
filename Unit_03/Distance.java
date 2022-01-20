//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		calcDistance();
	}

	public Distance(int x1, int y1, int x2, int y2)		//specific constructor
	{
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
		setCoordinates(xOne, yOne, xTwo, yTwo);
		calcDistance();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)	//setter-modifier method(sets up) vs getter
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo-xOne,2)+Math.pow(yTwo-yOne,2));	
		System.out.println(Math.pow((xTwo-xOne),2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		
	System.out.println(distance);
	}
	
	//complete print or the toString
	public String toString()
	{
		return "The distance is :: " + distance;
	}
}