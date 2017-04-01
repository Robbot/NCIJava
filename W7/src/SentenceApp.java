/**
SentenceApp -- uses the instantiable class Sentence to count the number of words in a given sentence

@author HDCOMP students & a e chis

*/

import java.util.Scanner;

// declare a class named SentenceApp
public class SentenceApp {

    
	public static void main(String args[]){
	
	    // declare a variable of type Scanner named in, and then create an object of type Scanner to read data from the keyboard
		Scanner in = new Scanner(System.in);
		
		// declare a variable named mySentence to store the sentence entered by the user
		String mySentence;
		
		// input 
		System.out.println("Enter sentence:");
		mySentence = in.nextLine(); // reads an entire sentence (it reads everything it was entered until we pressed the Enter key)
		

		// use the instantiable class Sentence to count the number of words in a sentence
		// DECLARE a variable named objSen, and CREATE an object of type Sentence using the constructor without parameters Sentence()
		Sentence objSen = new Sentence();

		// use/call/invoke the setter method setSen() to store in the object objSen the input given by the user
		objSen.setSen(mySentence);


		// processsing
		// call/ invoke the method countWords() on the object objSen to perform the actual processing 	
		objSen.countWords();
		
		
		// output
		// use/call/invoke the getter method getCounter() to retrieve the number of words in the sentence
		int numWords = objSen.getCounter();
		// display the number of words in the sentence
		System.out.println(numWords);

	} // ends the main method

}  // ends the class



