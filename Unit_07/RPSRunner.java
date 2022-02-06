//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		RockPaperScissors game = new RockPaperScissors();
		boolean firstRun = true;
		{	
			do {
				if(firstRun != true) {
					out.print("\n");
				}
				out.print("Type in your prompt [R,P,S] :: ");
					
				//read in the player value
				game.setPlayers(keyboard.next());
				out.println(game);
				
				out.print("Do you want to play again? ");
				response = keyboard.next().charAt(0);
				firstRun = false;
			
				
			} while (response == 'y' || response == 'Y');
			
			
	}
	}
}



