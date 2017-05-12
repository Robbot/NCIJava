/**

Problem 3
Develop an application that accepts a number of millilitres from the user.  The
application should then calculate and output the equivalent value in litres
and pints.
Hint 1litre = 2.11 pints

@author a e chis
*/

package w03;
import java.util.Scanner;

// declare a class named Converter
public class Converter {

	// declare instance variables
	private double litres; // to store the value in litres
	private double pints;  // to store the value in pints

	// declare an instance constant
	private final double LP = 2.11;

	// declare processing method
	// declare a method with 1 parameter to convert from millilitres to litres and pints
	public void convert(double millilitres){
		// convert to litres
		litres = millilitres/1000;
		// convert to pints
		pints = litres * LP;
	}


	// declare a method without any parameters
	public void display() {
		System.out.println("litres: " + litres);
		System.out.println("pints: " + pints);
	}

	public static  void main(String args[]){


		// we will ask the user to provide the number of millilitres -- that means we will reuse the Scanner class to perform the reading
		// declare a variable of type Scanner
		Scanner keyboard;
		// create an object of type Scanner
		keyboard = new Scanner(System.in);

		// input
		// prompt/ask the user for data
		System.out.println("millilitres:");
		double ml = keyboard.nextDouble(); // reads a double number from keyboard and saves it in the double variable named ml

		// declare a variable of type Converter
		Converter conv;
		// create an object of type Converter
		conv = new Converter();

		// processing
		// call/invoke the method convert() on the object conv to convert from millilitres to litres and pints
		// the method convert() takes in one argument, that is the number of millilitres stored in ml
		conv.convert(ml);

		// output
		// call/invoke the method display() on the object conv to print the number of litres and the number of pints
		conv.display();
    }
}
