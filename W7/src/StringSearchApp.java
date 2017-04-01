/**

Characters and Strings Problems

Problem 5
Develop an application that accepts a piece of text from the user and a character.  The application should search the text and return the index within the text of the first occurrence of the specified character.  The application should make use of instantiable classes.  Name the instantiable class StringSearch.

The application should use the index returned by the instantiable class, and display a customized message according to the following rules:
    -- If  the  character  is  found  within  the  text  display  the  message  "first occurrence of character at index:  ";
    -- If the character is not found within the text display the message "character not found in the given text"  

@author a e chis


TODO: Compile, then run the application to test it for different texts and different characters.
Possible test cases

    - for a given text, provide different  values for the character:
			-- a character which does not exist in the text
			-- a character which exists one time in the text
			-- a character which exists multiple times in the text
  
    For example, if the text is "banana", and the character is 'z' then the index would be -1
    For example, if the text is "banana", and the character is 'b' then the index would be 0
    For example, if the text is "banana", and the character is 'a' then the index would be 1

Remember! We must all the time test an application to ensure it works as described in the specification.    

*/

import java.util.Scanner;
public class StringSearchApp{
	public static void main(String args[]){

		// declare local variables
		String t; // to store the user's text
		char c; // to store the user's character
		
		// create an object of type Scanner to read input from keyboard
		Scanner sc = new Scanner(System.in);


		// declare a variable of type StringSearch, and create an instance/object of the instantiable class StringSearch
		StringSearch search = new StringSearch();
		
		// input
		// prompt the user to enter a text
		System.out.println("enter a text:");
		t = sc.nextLine(); // reads a text in from the user and store the text in the variable t
		
		// call/ invoke the setter method
		// use the setter to pass the text in to the object, namely to store the user's text(i.e. saved in the variable t) into the object's instance variable named text
		search.setText(t);
		
		// prompt the user to enter a character
		System.out.println("enter a character:");
		String s = sc.next(); // reads one single word in from the user and store the text in the variable s
		//above we saved the input data in a String, therefore we must retrieve just the first letter of the String s, as the user should provide one single character
		c = s.charAt(0);
		
		// call/ invoke the setter method
		// use the setter to pass the character in to the object, namely to store the user's character (i.e. saved in the variable c) into the object's instance variable named character
		search.setCharacter(c);
		
	    int index;
		// processing
		System.out.println("one possible solution:");
		// one possible solution: invoke/call the method findIndexFullTraversal() to find the index within the text of the first occurrence of the specified character
		search.findIndexFullTraversal();

		// output
		// use the getter method to retrieve the index
		index = search.getIndex();
        if (index == -1) {
            System.out.println("character " + c + " not found in the given text");            
        } else {
            System.out.println("first occurrence of character " + c + " at index: " + index);            
        }
        

		// processing
		System.out.println("another possible solution:");        
        // another possible solution: invoke/call the method findIndex() to find the index within the text of the first occurrence of the specified character
		search.findIndex();

		// output
		// use the getter method to retrieve the index
		index = search.getIndex();
        if (index == -1) {
            System.out.println("character " + c + " not found in the given text");            
        } else {
            System.out.println("first occurrence of character " + c + " at index: " + index);            
        }
	}
}
