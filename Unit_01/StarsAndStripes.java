//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()								//
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("");
	   out.println("");
   }
   
   public void printASmallBox()
   {	
	   
   }
 
   public void printABigBox()
   { 	
   }   
   
   public static void main (String[] args)
   {
	   StarsAndStripes A = new StarsAndStripes();			//instantiation uses the class to create an object [pub static void--creates object]
	   A.printTwentyStars();
	   A.printTwentyDashes();
}
}