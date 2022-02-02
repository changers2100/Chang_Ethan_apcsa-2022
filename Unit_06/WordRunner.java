//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word test = new Word();
		test.setString("Hello");
		out.print(test);
		
		test.setString("World");
		out.println(test);
		
		test.setString("JukeBox");
		out.println(test);
		
		test.setString("TCEA");
		out.println(test);
		
		test.setString("UIL");
		out.println(test);
		
	}
}