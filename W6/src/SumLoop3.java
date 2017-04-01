/**
SumLoop.java
	calculates the sum of all the numbers from 1 to n using
		-- a while loop
		-- a for loop

@author HDCOMP students and a e chis */
import java.util.Scanner;

public class SumLoop3{
	public static void main(String args[]){

		// while loop example
		// declare variables
		boolean n = true; // this time we will prompt the user to provide yes or no
		int number;
		int sum;
		
		while (n == true){ //loop condition: as long as n is true then to repeat the statements from the body of the loop
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number to be squared ");
			number = sc.nextInt();
			
			sum = number*number; // add the current value of sum and the current value of i, and then store the new result in the variable sum
			// output
			System.out.println("Your number to the second power is "+sum);
			
			Scanner sd;
			sd = new Scanner(System.in);
			System.out.println("Do you want to square another number? True or false? ");
			n = sd.nextBoolean();
		}

		System.out.println("You decided not to provide another number - exiting ");
	} // ends body of the main

} // ends body of class


