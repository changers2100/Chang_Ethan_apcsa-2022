//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String firstName = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		int firstSize = keyboard.nextInt();
		

		
		//instantiate monster one
		Skeleton Monster1 = new Skeleton(firstName, firstSize);
		//ask for name and size
				
				
		System.out.println("Enter 2nd monster's name : ");
		String scndName = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		int secondSize = keyboard.nextInt();
				
			
				
		//instantiate monster two
		
		Skeleton Monster2 = new Skeleton(scndName, secondSize);
		
		//compareMonsterSize
		
		if(Monster1.isBigger(Monster2)) {
			System.out.println("Monster one is bigger than Monster two.");
		}
		
		else if(Monster1.isSmaller(Monster2)){
			System.out.println("Monster one is smaller than Monster two.");
		}
		
		else {
			System.out.println("Monster one is the same size as Monster two.");
		}
				
		//compareMonsterName
		if(Monster1.namesTheSame(Monster2)) {
			System.out.println("Monster one has the same name as Monster Two");
		}
		
		else {
			System.out.println("Monster one does not have the same name as Monster two");
		}
	}
}