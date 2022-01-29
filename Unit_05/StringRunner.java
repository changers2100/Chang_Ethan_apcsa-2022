//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven a = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a string :: ");
		String b = keyboard.nextLine(); //looks at nextString
		a.setString(b); 				 //sets String c = to the input of s/word
		out.println(a);
		
		
		out.print("Enter a string :: ");
		String c= keyboard.nextLine(); 
		a.setString(c);
		out.println(a);
		
		out.print("Enter a string :: ");
		String d= keyboard.nextLine(); 
		a.setString(d);
		out.println(a);
		
		out.print("Enter a string :: ");
		String e= keyboard.nextLine(); 
		a.setString(e);
		out.println(a);
		
	}
}