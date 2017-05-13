package w07;
/**
Characters and Strings Problems

Problem 5
Develop an application that accepts a piece of text from the user and a character.  The application should search the text and return the index within the text of the first occurrence of the specified character. The application should make use of instantiable classes. Name the instantiable class StringSearch.

The application should use the index returned by the instantiable class, and display a customized message according to the following rules:
    -- If  the  character  is  found  within  the  text  display  the  message  "first occurrence of character at index:  ";
    -- If the character is not found within the text display the message "character not found in the given text"

@author a e chis

    For example, if the text is "banana", and the character is 'z' then the index would be -1
    For example, if the text is "banana", and the character is 'b' then the index would be 0
    For example, if the text is "banana", and the character is 'a' then the index would be 1

*/

public class StringSearch {

	// declare the instance variables/ data members
	private String text; // to store a piece of text
	private char character; // to store a character
	
	private int index; // to store the index, if any, within the text of the first occurrence of the specified character -- to be computed

	// declare constructor without parameters
	public StringSearch(){
	}

	// declare setter methods
	// setter method to assign a value to the instance variable text
	public void setText(String text){
		this.text = text;
	}

	// setter method to assign a value to the instance variable character
	public void setCharacter(char c){
		character = c;
	}
	
	
	// declare getter methods
	// getter method to retrieve the value of the index
	public int getIndex(){
		return index;
	}
	
	

	// declare a processing/ compute method to search the text and calculate the index within the text of the first occurrence of the specified character; the index is -1 if the text does not contain the given character
	// the next method presents one possible solution, for a more efficient solution please consult the method findIndex()
	public void findIndexFullTraversal(){
		// processing
		
		// we know that the first character of a text is located at index 0 and all the subsequent characters are located at an index <=text.length() - 1, therefore we must choose a value which shows whether a specified character is not within the given text. For example, we could use a negative number as the value for the index to show when the text does not contain the given character
		index = -1; // let us assume that the character is not within the text

		
		int len = text.length(); // the numbers of characters in the text
		// we must search the text (i.e. traverse the text) and find the first occurrence of the specified character
		// because we need to find the first occurrence of the character within the text, one solution would be to start the traversal from the end
		for (int i = len-1; i >= 0; i--) {

			// retrieve the character located at the index i in the word
			char currentChar = text.charAt(i);
			if (currentChar == character){ // the current character is identical with the given character
			    index = i; // save the current index i in the index instance variable
			}
		}
		// when the traversal of the for ends the index instance variable will contain the index of the first occurrence of the character within the text, or -1 if the text does not contain the character
	}
	
	
	
	
    
    // another possible solution
	// declare a processing/ compute method to search the text and calculate the index within the text of the first occurrence of the specified character; the index is -1 if the text does not contain the given character
	public void findIndex() {
		
		// we know that the first character of a text is located at index 0 and all the subsequent characters are located at an index <=text.length() - 1, therefore we must choose a value which shows whether a specified character is not within the given text. For example, we could use a negative number as the value for the index to show when the text does not contain the given character
		index = -1; // let us assume that the character is not within the text

		
		int len = text.length(); // the numbers of characters in the text
		// we must search the text (i.e. traverse the text) and find the first occurrence of the specified character
		for (int i = 0; i < len; i++) {

			// retrieve the character located at the index i in the word
			char currentChar = text.charAt(i);
			if (currentChar == character){ // the current character is identical with the given character
			    index = i; // save the current index i in the index instance variable
			    // we just found the index within the text of the first occurrence of the specified character, therefore it does not make sense to traverse the text further. consequently, we can use the break statement to terminate the for loop -- i.e. we break out of the for loop
			    break; // the execution of the loop finishes
			}
		}
		// here the index instance variable will contain the index of the first occurrence of the character within the text, or -1 if the text does not contain the character
	}
	
	
}


