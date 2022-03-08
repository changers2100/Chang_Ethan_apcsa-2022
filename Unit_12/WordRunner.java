//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\change2010\\Desktop\\Chang_Ethan_apcsa-2022\\Unit_12\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		for (int i = 0; i < words.length; i++) {
			words[i] = new Word(file.nextLine());
		}
		
		Arrays.sort(words);
		
		for (Word word : words)
		{
			out.println(word);
		}
		
		Word a = new Word("pig");
		Word b = new Word("cats");
		System.out.println(b.compareTo(a));
	}










	}