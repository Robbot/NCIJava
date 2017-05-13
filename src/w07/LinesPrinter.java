package w07;
/**
	 --->
	"Java"
	
LinesPrinter 
    -- accepts one word from the user and prints
                --- the number of characters in the word
                --- each letter of the word on a new line.
	
@author HDCOMP students & a e chis
*/

import java.util.Scanner;

// declare a class named LinesPrinter
public class LinesPrinter {
    
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
		

		int length = word.length(); // the numbers of characters in the word
		System.out.println(word + " has " + length + " characters");
        
        // counter-controlled loop		
		// traverse the word from the first character to the last character, and display one character at a time
		for (int i = 0; i <= length - 1; i++){
		    // first, retrieve the character at the index i, and next store that character in the variable c
			char c = word.charAt(i);
			
			// output
			// use the println() method so that a new line is added after each character
			// display the character stored in the variable c
			System.out.println(c);
			
		} // ends the for loop
		
	} // ends the main method
	
} // ends the class


