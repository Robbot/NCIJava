package w06;
/**
Lab: Repetition Statements

Problem 5
The factorial of a nonnegative integer n is written as
n! and is defined by the following formula
n! = n * (n - 1) * (n - 2) * (n - 3) * ... * 1, where 0! = 1.
Develop an application which reads a nonnegative integer number, and
then calculates and displays the number's factorial.

@author a e chis

TODO: Compile, then run the application to test it for different values of n.
	Possible test cases i.e. different values for n:
			-- a negative value, e.g. -4
			-- zero 
			-- 1
			-- 4
			-- a larger number
Remember! We must all the time test an application to ensure it works as described in the specification.

*/

import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		// declare local variables
		int n; // variable to store the nonnegative number provided by the user
		int fact; // variable to store the factorial 
		Scanner sc = new Scanner(System.in);

		// input
		// prompt the user to input a non-negative integer number and validate that the user provides a valid value
		// as long as the user provides an invalid value, keep asking the user for a nonnegative value
		do {
			System.out.println("enter a nonnegative integer:");
			n = sc.nextInt();
		} while (n < 0);

		// compute the factorial according to the given formula
		fact = 1; //initialize the fact with 1 (the problem tells us that 0! = 1)
		// we can loop from 1 to n, or from n to 1; either one of the traversals is correct because the multiplication is commutative
		for (int i = n; i >= 1; i--){
			fact = fact * i;
		}
		
		System.out.println(n + "! = " + fact);
	}
}

