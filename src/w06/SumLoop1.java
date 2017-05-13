package w06;
/**
SumLoop.java
	calculates the sum of all the numbers from 1 to n using
		-- a while loop
		-- a for loop

@author HDCOMP students and a e chis */
import java.util.Scanner;

public class SumLoop1{
	public static void main(String args[]){

		// while loop example
		// declare variables
		int i=0;
		int n= 3; // usually, we will prompt the user to provide the value for n
		int number;
		int sum;	// = 0;
		sum = 0;  // initialization of the sum
		// initialize the loop control variable / the counter
		i = 1;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		while (i<=n){ //loop condition: as long as i is lower than or equal to n repeat the statements from the body of the loop
			
			System.out.println("enter a number to be squared ");
			number = sc.nextInt();
			
			sum = number*number; // add the current value of sum and the current value of i, and then store the new result in the variable sum
			i = i + 1; // progression to next iteration
			
			// output
			System.out.println("Your number squared is "+sum);
		}
		System.out.println("You provided me three numbers - exiting ");
	} // ends body of the main

} // ends body of class


