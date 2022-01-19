//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Ethan Chang
//Date - 1/19/2022

public class Cube
{
	private double side;
	private double surfaceArea;
	
	public void sideOne() {
		side = 130;
	}
	
	public void surfaceArea() {
		surfaceArea = 6* Math.pow(side, 2);
	}
	public static double area( int side )
	{
		System.out.print("The surface area is: ");
		System.out.print(surfaceArea);
		System.out.println();
	}
}