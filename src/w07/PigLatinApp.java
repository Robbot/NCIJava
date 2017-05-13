package w07;
/**
PigLatinApp is an application which does the following tasks
		-- prompts the user to input a word
		-- uses the instantiable class PigLatin to perform the actual translation of a word from English to PigLatin
		-- retrieves the word in PigLatin and displays it

@author a e chis
*/

import java.util.Scanner;
public class PigLatinApp{
	public static void main(String args[]){

		// declare local variables
		String w; // to store the user's word
		String pigLatinWord; // to store the translated version
		
		// create an object of type Scanner to read input from keyboard
		Scanner sc = new Scanner(System.in);
		
		// input
		// prompt the user to enter a word
		System.out.println("enter a word:");
		w = sc.next(); // reads a single word and store the word in the variable w

		// declare a variable of type PigLatin, and create an instance/object of the instantiable class PigLatin
		PigLatin translator = new PigLatin();
		
		// call/ invoke the setter method
		// use the setter to pass the data in to the object, namely to store the user's word (i.e. saved in the variable w) into the object's instance variable named word
		translator.setWord(w);
		
		// processing
		// invoke/call the method translateWord() to translate the word from English to PigLatin
		translator.translateWord();

		// output
		// use the getter method to retrieve the word in the PigLatin language
		pigLatinWord = translator.getPigWord();
		// output the translated word
		System.out.println(pigLatinWord);
	}
}
