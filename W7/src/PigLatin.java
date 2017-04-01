/**
PigLatin is an instantiable class which translates a word from English to PigLatin
	translation rule: the first letter of a word is moved to the end of the word and the letters "ay" are added to the end

@author a e chis
*/

public class PigLatin {

	// declare the instance variables/ data members
	private String word; // to store the user's word
	private String pigWord; // to store the translated version

	// declare constructor without parameters
	public PigLatin(){
	    // initialize the two instance variables with the empty String "", otherwise by default the two instance variables would be initialized with null
		word = "";
		pigWord = "";
	}

	// declare setter methods
	// setter method to assign a value to the instance variable word
	public void setWord(String word){
		this.word = word;
	}

	// declare getter methods
	// getter method to retrieve the translated word in PigLatin language
	public String getPigWord(){
		return pigWord;
	}

	// declare the processing/ compute method -- translates a word from English to a new word in PigLatin
	public void translateWord(){
		// processing
		// declare local variable sb AND create an object of type StringBuffer to build the translated word
		StringBuffer sb = new StringBuffer();
		
		int len = word.length(); // the numbers of characters in the word
		// start the traversal of the word from the second character (according to the translation rule) until the end of the word
		for (int i = 1; i < len; i++) {

			// retrieve the character located at the index i in the word
			char letter = word.charAt(i);
			// add the character to the buffer
			sb.append(letter); // add each letter to the new word
		}
		// add the first character of the original word at end of the new word (i.e. at the end of the translated word)
		char firstLetter = word.charAt(0);
		sb.append(firstLetter);
		// add the "ay" at the end of the translated word
		sb.append("ay");
		
		// convert the StringBuffer object to a String object, and save it in the instance variable named pigWord
		pigWord = sb.toString();
	}
}
