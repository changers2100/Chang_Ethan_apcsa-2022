//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	
	public static double check( double a, double b )
	{
	
	if (a>b) {
		System.out.println(a-b);
	}
	
	if (b>a) {
		return(b-a);
	}
	
	else {
		System.out.print(a*b);
	}
	
	}
}