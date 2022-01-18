//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()								//default constructor
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
	   out.println(" _________");
	   out.println("|         |");
	   out.println("|         |");
	   out.println("|_________|");
	   
   }
 
   public void printABigBox()
   { 	
	   out.println(" ______________");
	   out.println("|              |");
	   out.println("|              |");
	   out.println("|              |");
	   out.println("|              |");
	   out.println("|______________|");
   }   
   
   public static void main (String[] args)
   {
	   StarsAndStripes A = new StarsAndStripes();			//instantiation uses the class to create an object [pub static void--creates object]
	   A.printTwentyStars();
	   A.printTwentyDashes();
	   A.printASmallBox();
	   A.printTwentyStars();
	   A.printTwentyDashes();
	   A.printTwentyStars();
	   A.printTwentyDashes();
	   A.printABigBox();
}
}