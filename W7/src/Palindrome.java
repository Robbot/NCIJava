/**

A palindrome is a string that reads the same forwards and backwards. For
example, "noon" and "dennis sinned" are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:

The string is a palindrome.

Otherwise, it should print out the message:

The string is not a palindrome.

The application should make use of instantiable classes.

Hint: use the Reverse code.

Palindrome is an instantiable class which determines whether a given string is a palindrome or not

@author a e chis
*/

// declare the instantiable class
public class Palindrome {

	// declare instance variables/ data members
	private String text; // the initial text
	private String palindromeMessage; // the message whether the text is a palindrome or not

	// declare constructor without parameters
	public Palindrome(){
	     // initialize the two instance variables with the empty String "", otherwise by default the two instance variables would be initialized with null
		text = "";
		palindromeMessage = "";
	}

	// declare setter methods
	// setter method to store/assign a value in/to the instance variable text
	public void setText(String text){
		this.text = text;
	}

	// declare getter methods
	// getter method to retrieve the reversed string
	public String getPalindromeMessage(){
		return palindromeMessage;
	}
	
	// processing / compute method -- determine whether a given string is a palindrome
	// one approach
	public void decideIsPalindrome1(){
		// processing
		// according to the problem description: a palindrome is a string that reads the same forwards and backwards
		// therefore, we must check whether the initial string and the string read backward are identical, if so, the string is a palindrome. 
		// to solve this task we should write the code for the next 2 steps:
			// step 1: create the text read backward: create a new string by reversing the letters of the initial string
			// step 2: check whether the initial string and the reversed string are identical and store the appropriate message in the palindromeMessage instance variable

		// step 1: create the text read backward: create a new string by reversing the letters of the initial string
		// declare a variable named sb of type StringBuffer AND create an object of type StringBuffer to build the reversed string
		StringBuffer sb = new StringBuffer();
		
		int len = text.length(); // the numbers of characters in the string
		// traverse the string from the end (i.e. the last character) to the beginning because we want to reverse the string
		for (int i = len-1; i >= 0; i--){
			// retrieve one character in each iteration of the loop
			char c = text.charAt(i);
			// add each character to the sb (i.e. the StringBuffer instance)
			sb.append(c); 
		}
		// convert the StringBuffer instance sb to a String instance and save it in the reversedText local variable
		String reversedText = sb.toString();


		// step 2: check whether the initial string and the reversed string are identical and store the appropriate message in the palindromeMessage instance variable
		if (text.equalsIgnoreCase(reversedText)) {
			palindromeMessage = "The string " + text +  " is a palindrome.";
		} else {
			palindromeMessage = "The string " + text +  " is not a palindrome.";
		} 
	}
	
	// processing / compute method -- determine whether a given string is a palindrome
	// another possible solution
	// note: either decideIsPalindrome1() or decideIsPalindrome2() methods offers a correct solution
	public void decideIsPalindrome2(){
		// processing
		// according to the problem description: a palindrome is a string that reads the same forwards and backwards
		// therefore, we must check whether the initial string and the string read backward are identical, if so, the string is a palindrome. 
		// to solve this task we should write the code for the next 2 steps:
			// step 1: create the text read backward: create a new string by reversing the letters of the initial string
			// step 2: check whether the initial string and the reversed string are identical and store the appropriate message in the palindromeMessage instance variable

		// step 1: create the text read backward: reuse the code defined in the reverseText() method
		// note: the method reverseText() is defined in this class, and therefore we can call it directly by using the name of the method (i.e. we do not need to create an object of type Palindrome)
		// call the method reverseText() to compute the reversed text and store the result in the local variable called reversedText
		String reversedText = reverseText();

		// step 2: check whether the initial string and the reversed string are identical and store the appropriate message in the palindromeMessage instance variable
		if (text.equalsIgnoreCase(reversedText)) {
			palindromeMessage = "The string " + text +  " is a palindrome.";
		} else {
			palindromeMessage = "The string " + text +  " is not a palindrome.";
		} 
	}
	
	
	// processing / compute method
	// the method creates a new text by reversing the letters in the given text
	// the method returns the reversed text
	public String reverseText(){
		// processing
		// declare a variable named sb of type StringBuffer AND create an object of type StringBuffer to build the reversed text
		StringBuffer sb = new StringBuffer();
		
		int len = text.length(); // the numbers of characters in the text
		// traverse the text from the end (i.e. the last character) to the beginning because we want to reverse the text
		for (int i = len-1; i >= 0; i--){
			// retrieve one character in each iteration of the loop
			char letter = text.charAt(i);
			// add each character to the sb (i.e. the StringBuffer instance)
			sb.append(letter); 
		}
		// convert the StringBuffer instance sb to a String instance and save it in the reversedText local variable
		String reversedText = sb.toString();

		// return the reversed text
		return reversedText;
	}
}


