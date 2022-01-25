//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		double discount = Discount.getDiscountedBill(amt); 			//className.method()
		out.printf( "Bill after discount :: " + "%.2f\n", discount);
		
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		double discount2 = Discount.getDiscountedBill(amt2); 			//className.method()
		out.printf( "Bill after discount :: " + "%.2f\n", discount2);
		
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		double discount3 = Discount.getDiscountedBill(amt3); 			//className.method()
		out.printf( "Bill after discount :: " + "%.2f\n", discount3);
		
		
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		double discount4 = Discount.getDiscountedBill(amt4); 			//className.method()
		out.printf( "Bill after discount :: " + "%.2f\n", discount4);
		
		
		
		out.print("Enter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		double discount5 = Discount.getDiscountedBill(amt5); 			//className.method()
		out.printf( "Bill after discount :: " + "%.2f\n", discount5);

	}
}