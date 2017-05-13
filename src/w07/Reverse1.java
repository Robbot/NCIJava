package w07;
/**
You have been asked to develop an application that accepts a word from the
user, reverses and saves the reversed word as a new word and outputs the
new word. The application should make use of instantiable classes and the
instantiable class should be named Reverse.java.

For example, if the word is
	Java
the new word is
	avaJ

Note that we call this class Reverse1 as we have already created a class named Reverse for another problem

Reverse1 is an instantiable class which creates a new word by reversing the letters of a given word

@author a e chis
*/

public class Reverse1 {

	// declare instance variables/ data members
	private String word; // the initial word
	private String reversedWord; // the reversed word

	// declare constructor without parameters
	public Reverse1(){
	     // initialize the two instance variables with the empty String "", otherwise by default the two instance variables would be initialized with null
		word = "";
		reversedWord = "";
	}

	// declare setter methods
	// setter method to store/assign a value in/to the instance variable word
	public void setWord(String word){
		this.word = word;
	}

	// declare getter methods
	// getter method to retrieve the reversed word
	public String getReversedWord(){
		return reversedWord;
	}

	// processing / compute method -- create a new word by reversing the letters of a given word
	public void reverseWord(){
		// processing
		// declare a variable named sb of type StringBuffer AND create an object of type StringBuffer to build the reversed word
		StringBuffer sb = new StringBuffer();
		
		int len = word.length(); // the numbers of characters in the word
		// traverse the word from the end (i.e. the last character) to the beginning because we want to reverse the word
		for (int i = len-1; i >= 0; i--){
			// retrieve one character in each iteration of the loop, namely retrieve the character located at the index i
			char letter = word.charAt(i);
			// add each character to the sb (i.e. the StringBuffer instance)
			sb.append(letter); 
		}
		
		// convert the StringBuffer instance/object sb to a String instance and save it in the reversedWord instance variable
		reversedWord = sb.toString();
	}
}



