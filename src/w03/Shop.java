/**

Problem 2
You have been asked to create an application for the Student Union shop
which sells caps for 5, shirts for 10 and hoodies for 20. Your application
should allow the user to input the quantity of each item a student wants to
buy and then calculate and output the total cost.
When you have finished implementation, be sure to test your application
to ensure the calculations are correct.

@author HDCOMP students and a e chis
*/

package w03;
import java.util.Scanner;

// declare a class named Shop
public class Shop {
	// declare instance variables 
	
		// declare constants
		final int CAP_PRICE  = 5;
		final int SHIRT_PRICE = 10;
		final int HOODIES_PRICE = 20;
		
		// declare an instance variable to store the total cost
		private int cost;
		
		// declare processing method
		// declare a method with 3 parameters to calculate the cost of the items bought
		public void calculatePrice(int shirts, int hoodies, int caps){
			// calculate the total cost knowing the quantities and their corresponding price
			cost = shirts * SHIRT_PRICE + hoodies * HOODIES_PRICE + caps * CAP_PRICE;		
		}
		
		
		// declare a method without any parameters
		public void displayCost() {
			System.out.println("total cost: " + cost);
		}
		
		public static  void main(String args[]){
			// declare a variable of type Shop
			Shop banana;
			// create an object of type Shop
			banana = new Shop();
			
			// we should not use the method displayCost() if we haven't calculated the cost yet as this will not show us any meaningful result -- please note the zero value displayed
			banana.displayCost();
			
			
			// ask the user to provide the quantity for each item bought -- that means we will reuse the Scanner class to perform the reading
			// declare a variable of type Scanner
			Scanner keyboard;
			// create an object of type Scanner
			keyboard = new Scanner(System.in);
			
			// prompt/ask the user for data
			System.out.println("# caps: "); 
			int c = keyboard.nextInt(); // reads an integer number from keyboard and saves it in the int variable named c
			System.out.println("# hoodies: ");
			int h = keyboard.nextInt(); // reads an integer number from keyboard and saves it in the int variable named h
			System.out.println("# shirts");
			int s = keyboard.nextInt(); // reads an integer number from keyboard and saves it in the int variable named s
			
			// processing
			// call/invoke the method calculatePrice() on the object banana to calculate the price of the shopping
			// the method calculatePrice() takes in three arguments, that are the value stored in s, h and c
			banana.calculatePrice(s, h, c);
			
			// output
			// call/invoke the method displayCost() on the object banana to show the price of the shopping
			banana.displayCost();
	    }	
}
