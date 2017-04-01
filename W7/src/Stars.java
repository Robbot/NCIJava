/** 
Stars.java -- accepts a word from the user and prints a * for each letter of the word.

@author adriana e chis
*/

import java.util.Scanner;
public class Stars{
	public static void main(String args[]){
		
		// declare variables
		// declare a variable to store the word to be entered by the user
		String word;
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.println("enter a word: ");
		word = input.next(); // reads one single word
		
		// processing
		// traverse the word from the beginning (i.e. the first character) to the end (i.e. the last character)
		// in this problem it does not matter whether we traverse the word from the beginning to the end, or from the end to the beginning, as we we do not need to display the characters of the word, we need the counter-controlled loop to ensure that we displays as many '*' as the length or size (i.e. numbers of characters) of the word
		for (int i = 0; i < word.length(); i++) {
			System.out.print("*"); // display one *
		}
		System.out.println(); // this is not requested by the text of the problem -- it is just to better display the result
	}	
}
