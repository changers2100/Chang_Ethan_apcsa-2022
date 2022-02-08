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
		char a = letter;
		for (int i = 0; i < amount; i++) //0-1-2-3
		{	
			a = letter;  //helps the alphabet loop back around
			for (int j = 0; j < amount-i; j++)//0-1-2
			{
				for (int k = amount; k > j; k--) //k = 4, 3, 2, 1
				{
					if (a+j > 'Z') a -= 26;  //C+0 = C, C+1 = D, E
					output += (char)(a+j);
				}
				output += " ";
			
			}
			
			output += "\n";
		}


		
		return output;
	}
}