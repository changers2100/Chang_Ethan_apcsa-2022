//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		switch((int)Math.random()*3)
		{
		case 0: compChoice = "R";
		case 1: compChoice = "P";
		case 2: compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";	
		
		switch(playChoice)
		{
		case "R":
		case "r":
			if (compChoice.equalsIgnoreCase("P"))
				winner += "Computer wins <<Paper Covers Rock>>";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}