//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;	
	}

	public String toString()
	{
		String output="";
		char currLetter = letter;
		for (int i=0; i<=amount; i++) 				//run through four times (amount = 4)
		{
			currLetter = letter;					//currLetter = C
			for(int j =0; j< amount-1; j++) {		//j goes until one greaeter than amount-1 --3 times, number of words in each line
				
				
				for(int k=amount; k > j; k--) {		//k is the number of letters for each word so starts at amount 4, then decreases to 3 then two then 1until it is greater than J
					if(currLetter+j >'Z')
						currLetter -= 26;
					output += (char)(currLetter+j);
				}
				output += " ";
			}
		}
		
		return output;
	}
}