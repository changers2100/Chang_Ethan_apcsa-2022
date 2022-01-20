//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double x2m1 = x2-x1;
		double y2y1 = y2-y1;
		return y2y1/x2m1;
	}

}