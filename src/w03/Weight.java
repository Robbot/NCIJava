/**

Problem 1
Write an application that displays the recommended weight given the user's
age and height (in centimetres) using the following formula:
	RecommendedWeight = (height - 100 + age % 10) * 0.90

@author a e chis
*/

package w03;
import java.util.Scanner;

// declare a class named Weight
public class Weight {
	
	// declare instance variables 
	private double recommendedWeight; // to store the recommended height
	
	// declare processing method
	// declare a method with 2 parameters to calculate the recommended weight
	public void calculateRecommededWeight(int age, double height){
		// calculate the recommended weight knowing the age and the height of a person
		recommendedWeight = (height - 100 + age % 10) * 0.90;
	}
	
	
	// declare a method without any parameters
	public void display() {
		System.out.println("recommended weight: " + recommendedWeight);
	}
	
	public static  void main(String args[]){
		
		
		// we will ask the user to provide the age and height -- that means we will reuse the Scanner class to perform the reading
		// declare a variable of type Scanner
		Scanner keyboard;
		// create an object of type Scanner
		keyboard = new Scanner(System.in);
		
		// input 
		// prompt/ask the user for data
		System.out.println("age:");
		int a = keyboard.nextInt(); // reads an integer number from keyboard and saves it in the int variable named a
		System.out.println("height:");
		double h = keyboard.nextDouble(); // reads a double number from keyboard and saves it in the double variable named h
		
		// declare a variable of type Weight
		Weight banana;
		// create an object of type Weight
		banana = new Weight();
		
		// processing
		// call/invoke the method calculateRecommededWeight() on the object banana to calculate the recommended weight
		// the method calculateRecommededWeight() takes in two arguments, that are the values stored in a and h
		banana.calculateRecommededWeight(a, h);
		
		// output
		// call/invoke the method display() on the object banana to print the recommended weight
		banana.display();
    }	
}
