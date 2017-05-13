package w07;
/**
     --->
	"I learn Java."
	
Sentence -- counts the number of words in a given sentence. We assume that a word is separated from another word by ONE single space character.

@author HDCOMP students & a e chis
*/

// declare a class named Sentence
public class Sentence {

	// declare instance variables
	private String sen; // to store the sentence
	private int counter; // to store the number of words in the sentence -- to be computed
	
	// declare constructors
	// declare the constructor without parameters
	public Sentence(){
		sen = ""; // initialize the sen with the empty string
		// the counter is going to be initialized with its default value, namely 0
	}
	
	
	// declare a setter method to be able to store a value in the instance variable sen
	public void setSen(String sen){
	    // store the value from the parameter sen in the instance variable sen (i.e. this.sen)
		this.sen = sen;
	}
	
	
	// declare a getter method to be able to retrieve the number of words in the sentence
	public int getCounter(){
		return counter;
	}
	
	
	// declare processing/compute method
	public void countWords(){
		counter = 0; // initialize the counter to 0 -- needed in case that we use the same object to count multiple times
		
		// traverse the sentence (by using a loop) and count the words
		int len = sen.length(); // the number of characters in a sentence
		int i = 0;  // declare counter controller variable i of type int, and initialize it with 0 -- recall that a String is zero-based index (i.e. the first letter has the index 0)
		while(i < len){ // while all the characters haven't been traversed yet
            // retrieve the character from the sentence located at the index i, and store it in the variable c
			char c = sen.charAt(i);
			
			// check whether the current character is a space, if so, we know that a word has ended at the index i-1
			if (c == ' '){ // word boundary
				counter += 1; // increase the counter that keeps track of the number of words seen so far
				// the above statement is equivalent with the next two, feel free to use any version you like
				// counter = counter + 1;
				// counter++;
				
			} // ends the if

			// progression to the next character (i.e. next loop iteration)
			i++;
			
		} // ends the while loop
		
		// below, we add 1 to the counter for the last word in the sentence because the last word in a sentence is not accounted for in the above while loop as it is not followed by a space
		// e.g. "I learn Java." -- there are only 2 spaces (i.e. there is no space after Java), but the sentence contains 3 words
		counter = counter + 1;
			
	} // ends the method countWords()
	
} // ends the class


