//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age,name);
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		
		int oldest = pups[0].getAge();					//starts at index 0
		int oIndex = 0;
		for(int i = 0; i< pups.length; i++) {
			if(pups[i].getAge() > oldest) {
				oldest = pups[i].getAge();
				oIndex = i;
			}
		}
		
		
		return pups[oIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = pups[0].getAge();
		int yIndex = 0;
		for(int i = 0; i<pups.length; i++) {
			if(pups[i].getAge() < youngest) {
				youngest = pups[i].getAge();
				yIndex = i;
			}
		}
		
		return pups[yIndex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}