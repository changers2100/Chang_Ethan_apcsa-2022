//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i< toyList.size(); i++) {
  			if(toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int count = toyList.get(0).getCount();
  		String toyName = toyList.get(0).getName();
  		
  		for(int i = 0; i<toyList.size(); i++) {
  			if(toyList.get(i).getCount() > count) {
  				count = toyList.get(i).getCount();
  				toyName = toyList.get(i).getName();
  			}
  		}
  		
  		return toyName;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sortList = new ArrayList<Toy>();
  		
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}