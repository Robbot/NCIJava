package w06;
/**
Lab: Repetition Statements

Problem 6
Develop an application to display the following patterns, one after another,
using for loops.
	• Pattern 1

	*
	**
	***
	****
	*****
	******

	• Pattern 2

	     *
	    **
	   ***
	  ****
	 *****
	******

Hint: You should use the following statements to print the patterns
• System.out.print('*');
• System.out.print(' ');
• System.out.println();
• You should not use other version of output statements in your program.

@author a e chis


TODO: Compile, then run the application to test it for different values of n.

*/

import java.util.Scanner;
// declare the class
public class PatternsApp{
	public static void main(String args[]){
		// declare variables
		int n;
		Scanner scan = new Scanner(System.in);

		// the value of n determines the size of the pattern
		System.out.println("enter a value for n");
		n = scan.nextInt();
		
		// we use counter-control loops because we know the value of n (i.e. the size of the pattern)
		
		/**
		print a pattern such as:

		*
		**
		***
		****
		*****
		******
		
		*/
		System.out.println();
		System.out.println("Pattern 1");
		System.out.println();
		// use 2 nested loops
		// outer loop: number of rows
		for( int i = 1; i <= n; i++){
			// inner loop: to print the columns, that is the information displayed on each row
			for (int j = 1; j <= i; j++){
				System.out.print("*");		
			}
			System.out.println();
		}
	
		
		/**
		print a pattern such as:

		     *
		    **
		   ***
		  ****
		 *****
		******

		*/
		System.out.println();
		System.out.println("Pattern 2");
		System.out.println();
		// use 2 nested loops
		// outer loop: number of rows
		for (int i = 1; i <= n; i++){
			// inner loop: to print the columns, that is the information displayed on each row
			for (int j = 1; j<= n; j++){
				// the if statement is used to select when the program should print a space (i.e. " ") and when a *
				if (i+j < n+1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}


		/**
		Another pattern:
		print a pattern such as:

		******
 		*****
  		****
		***
		**
		*

		*/
		System.out.println();
		System.out.println("Pattern 3");
		System.out.println();
		// use 2 nested loops
		// outer loop: number of rows
		for (int i = 1; i <= n; i++){
			// inner loop: to print the columns, that is the information displayed on each row
			for (int j = 1; j<= n; j++){
				// the if statement is used to select when the program should print a space (i.e. " ") and when a *
				if (i+j > n+1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}
}
