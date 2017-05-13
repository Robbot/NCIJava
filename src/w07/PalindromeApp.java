package w07;
/**

A palindrome is a string that reads the same forwards and backwards. For
example, noon and dennis sinned are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:

The string is a palindrome.

Otherwise, it should print out the message:

The string is not a palindrome.

The application should make use of instantiable classes.
Hint: use the Reverse code.

PalindromeApp is an application which does the following tasks
		-- prompts the user to input a text
		-- uses the instantiable class Palindrome to compute whether the user's input is a palindrome or not
		-- retrieves the result of the palindome check and dipslays it

@author a e chis
*/

import java.util.Scanner;

public class PalindromeApp {

	public static void main(String args[]){

		// declare local variables
		String t; // to store the user's input
		String message; // to store the palindrome message
		
		
		// declare a variable named sc of type Scanner AND create an object of type Scanner to read the input provided by user via keyboard
		Scanner sc = new Scanner(System.in);
		
		// input
		// prompt the user to enter a text
		System.out.println("enter a text:");
		t = sc.nextLine(); // reads an entire line of text (i.e. everything entered until the user hits the "Enter" key)

		// declare a variable named palin of type Palindrome AND create an instance/object of the instantiable class Palindrome
		Palindrome palin = new Palindrome();
		
		// call/ invoke the setter method
		// use the setter to store the user's input into the object's instance variable text
		palin.setText(t);
		
		// processing
		
		/* !!! recall that the Palindrome instantiable class has 2 methods which provide a solution to this problem
		you can use either one of the methods (i.e. either decideIsPalindrome1() or decideIsPalindrome2()
		note: if you used both methods, the same message is going to be displayed twice!!!
		*/ 
		
		//**************** ONE APPROACH **********************/
		// processing: one approach use/invoke/call the method decideIsPalindrome1() to compute whether the given text is a palindrome or not
		palin.decideIsPalindrome1();
		
		// output
		// use the getter method to retrieve whether the given text is a palindrome
		message = palin.getPalindromeMessage();
		// display the message
		System.out.println(message);
		
		
		//**************** ANOTHER APPROACH **********************/
		// processing: another approach use/invoke/call the method decideIsPalindrome2() to compute whether the given text is a palindrome or not
		palin.decideIsPalindrome2();
		
		// output
		// use the getter method to retrieve whether the given text is a palindrome
		message = palin.getPalindromeMessage();
		// display the message
		System.out.println(message);		
	}
}
