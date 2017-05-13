package w07;
/**
	 <---
	"Java"
	
Reverse -- accepts one word from the user, and prints the letters of the word in reverse order

@author HDCOMP students & a e chis

*/

import java.util.Scanner;

// declare a class named Reverse
public class Reverse {

    // declare the main method
	public static void main(String args[]){
		
		// declare locale variables
		// DECLARE a variable of type Scanner named input, and then CREATE an object of type Scanner to read data from the keyboard
		Scanner input = new Scanner(System.in);
		// DECLARE a variable to store the word entered by the user
		String word;
		
		// input
		System.out.println("Enter word: ");
		word = input.next(); // read one word only
		
		// counter-controlled loop	
		int length = word.length(); // the numbers of characters in the word
		// traverse the word from the end (i.e. the last character) to the beginning (i.e. the first character) and display one character at a time
		for (int i = length - 1; i >= 0; i--){
		    // first, retrieve the character at the index i, and next store that character in the variable c
			char c = word.charAt(i);
			
			// output
			// use the print() method so that all the characters are dispayed on the same line
			// display the character stored in the variable c
			System.out.print(c);			
		} // ends the for loop
		
		System.out.println();
		
	}  // ends the main method
	
}  // ends the class


