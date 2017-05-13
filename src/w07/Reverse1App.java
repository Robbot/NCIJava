package w07;
/**

You have been asked to develop an application that accepts a word from the
user, reverses and saves the reversed word as a new word and outputs the
new word. The application should make use of instantiable classes and the
instantiable class should be named Reverse1.java.

For example, if the word is
	Java
the new word is
	avaJ

Reverse1App is an application which does the following tasks
		-- prompts the user to input a word
		-- uses the instantiable class Reverse1 to perform the actual word reversal
		-- retrieves the reversed word and displays it

@author a e chis
*/

import java.util.Scanner;
public class Reverse1App{
	public static void main(String args[]){

		// declare variables
		String w; // to store the user's word
		String revWord; // to store the reversed word
		
		// declare a variable of type Scanner, and create an object of type Scanner to read the input provided by user via keyboard
		Scanner sc = new Scanner(System.in);
		
		// input
		// prompt the user to enter a word
		System.out.println("enter a word:");
		w = sc.next(); // reads one single word

		// declare a variable of type Reverse1, and create an instance/object of the instantiable class Reverse1
		Reverse1 r = new Reverse1();
		
		// call/ invoke the setter method
		// use the setter to store the user's word w into the object's instance variable word
		r.setWord(w);
		
		// processing: invoke/call the method reverseWord() on the object r to reverse the word
		r.reverseWord();

		// output
		// use the getter method to retrieve the reversed word
		revWord = r.getReversedWord();
		// display the reversed word
		System.out.println("the reversed word is: " + revWord);
	}
}
