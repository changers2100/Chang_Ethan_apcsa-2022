//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect(){  				//default
	  setNumber(0);
   }
   
   public Perfect(int a) {
	   setNumber(a);
   }
	//add a set method
   
  
   public void setNumber(int a) { 	//alternative
	   number = a;
   }
   	

	public boolean isPerfect()		//method algorithmn
	{
		int num = 1;
		int sum = 0;
		while(num< number) {				//for loop--while the divisor is less than the number, if divided by then add it to sum --to check if perfect square
			if (number% num == 0) {
				sum = sum + num;
			}
			num++;
		}
		if (sum==number) {					//outside of while loop--f the sum of divisors is equal to number then return true--it is a perfect square
			return true;
		}
		else {
		return false;
		}
			
	}

	//add a toString	
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect";
			}
		
		else {
			return number + " is not perfect";
			}
		}
	}
	
