//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare test = new WordsCompare();
	  
	   
	   test.setWords("abe","ape");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("girafee","gorilla");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("one","two");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("fun","funny");
	   test.compare();
	   System.out.print(test);

	   test.setWords("123","19");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("193","1910");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("goofy","godfather");
	   test.compare();
	   System.out.print(test);
	   
	   test.setWords("funnel","fun");
	   test.compare();
	   System.out.print(test);
	   
	

	   
	   
	   

	}
}