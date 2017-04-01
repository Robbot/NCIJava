import java.util.Random;
import java.util.Scanner;

public class GuessLoop {
	public static void main(String args[]){
		
		// declare and create an object of type Random
		Random myRand = new Random();
		// generate a number between 1 and 20
		int secret;
		secret = myRand.nextInt(20); // generate a random number between 0 inclusive and 20 exclusive, namely it can be either 0, 1, 2, ... , or 19
		// ensure the random number is between 1 inclusive and 20 inclusive
		secret = secret + 1;
		
		Scanner input = new Scanner(System.in);
		
		// allows the user to guess 3 times the secret number
		for (int i=0; i< 3; i++) {
		// input
			System.out.println("guess secret number:");
			int myNumber = input.nextInt(); 
			
			// process
			// check if user guessed the number
			if (secret == myNumber){
				System.out.println("Congratulations, you guessed the number");
				break; // terminates the for -- if the user has guessed the secret number we should not ask him again to guess the number
			} else if (myNumber > secret){
				System.out.println("You guessed too high, sorry.");
			} else {
				System.out.println("You guessed too low, sorry");
			} // ends if else if statements
			
		} // ends for 
		
		System.out.println("secret is: " + secret);		
		
	} // ends main
	
} // ends class

