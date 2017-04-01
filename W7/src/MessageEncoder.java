/**
encodes a word

Strings and StringBuffer Problems
Problem 2

MessageEncoder the instantiable class

@author HDCOMP students & a e chis

*/

// declare a class named MessageEncoder
public class MessageEncoder {
	
	// declare instance variables
	private String word;
	private String encodedWord;
	

	//private final int ONE = 1;
	
	// declare a constructor without parameters
	public MessageEncoder(){
		word = ""; // initialize with the empty String
		encodedWord = ""; // initialize with the empty String
		// recall that by default the default constructor initializes an instance variable of type String with null, and in general all instance variables which are not of a primitive data type are initialized with null
	}

	// declare setter method
	public void setWord(String word){
		this.word = word;
	}
	
	
	// declare getter method
	public String getEncodedWord(){
		return encodedWord;
	}
	
	
	// declare processing/compute method
	public void encode(){
   		// DECLARE a variable of type StringBuffer named sb, and CREATE an object of type StringBuffer to build the encoded word
		StringBuffer sb = new StringBuffer(); //""
		
		// the variable len will contain the number of characters in the word
		int len = word.length();
		// traverse the word and create a new word according to problem's rules
		// start the traversal of the word from the end (i.e. the last character) of the word to the beginning (i.e. the first character) of the word
		for (int i = len - 1; i >= 0; i--){
		
		    // retrieve the character located at index i in the word, and then store the character in the variable c
			char c = word.charAt(i);
			
			if (c == 'a' || c == 'A'){ // if the letter is 'a' or 'A'
			    // add 1 to the encoded word
				sb.append(1);
			} else if (c == 'e' || c == 'E'){  // if the letter is 'e' or 'E'
			    // add 5 to the encoded word
				sb.append(5);
			} else if (c == 'i' || c == 'I'){ // if the letter is 'i' or 'I'
			    // add 9 to the encoded word
				sb.append(9);
			} else if (c == 'o' || c == 'O'){  // if the letter is 'o' or 'O'
			    // add 15 to the encoded word
				sb.append(15);
			} else if (c == 'u' || c == 'U'){  // if the letter is 'u' or 'U'
			    // add 21 to the encoded word
				sb.append(21);
			} else {  // if the letter is not a vowel then add the letter itself to the encoded word
				sb.append(c);
			} // ends the if else if statements
						
		} // ends the for loop
		
		// store the encoded word (i.e. convert the StringBuffer object to a String object)
		encodedWord = sb.toString();
		
	} // ends the encode method
	
} // ends the class


