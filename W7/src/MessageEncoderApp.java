/** 

Strings and StringBuffer Problems
Problem 2

MessageEncoderApp uses the instantiable class MessageEncoder to encode a word provided by the user

@author HDCOMP students & a e chis

*/

import java.util.Scanner;

public class MessageEncoderApp{
	public static void main(String args[]){
	    // declare local variables 
		// declare the variable named banana of type MessageEncoder
		MessageEncoder banana;
        // create an object of type MessageEncoder
		banana = new MessageEncoder();
		
		// declare the variable named input of type Scanner, and create an object of type Scanner to be able to read from the keyboard
		Scanner input = new Scanner(System.in);
		
		// input
		// prompt the user to provide the word to be encoded
		System.out.println("enter word:");
		String w = input.next();
		
		// give the word to the banana object
		// use/call/invoke the setter method setWord() to store in the object banana the input given by the user
		banana.setWord(w);
		
		// processing: encode a word
		// call/ invoke the method encode on the object banana
		banana.encode();
		
		// output#
		// use the getter method to retrieve the encoded word
		String newWord = banana.getEncodedWord();
		// display the encoded word
		System.out.println(newWord);
		
	} // ends the main method

} // ends the class



