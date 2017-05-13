package w06;
/**
SumLoop.java
	calculates the sum of all the numbers from 1 to n using
		-- a while loop
		-- a for loop

@author HDCOMP students and a e chis */

public class SumLoop{
	public static void main(String args[]){

		// while loop example
		// declare variables
		int i;
		int n = 3; // usually, we will prompt the user to provide the value for n
		int sum;	// = 0;
		sum = 0;  // initialization of the sum
		// initialize the loop control variable / the counter
		i = 1;
		while (i<=n){ //loop condition: as long as i is lower than or equal to n repeat the statements from the body of the loop
			sum = sum + i; // add the current value of sum and the current value of i, and then store the new result in the variable sum
			i = i + 1; // progression to next iteration
		}
		// output
		System.out.println(sum);



		// for loop example
		// a for loop statement captures in one single line:
		//	the initialisation of the loop control variable / the counter; the loop condition; the update of the loop control variable/ the counter (ensures progression to the next iteration, if any)
		// the ; is mandatory between the 3 items of the for repetition statement
		sum = 0; // reset sum to zero -- we must set the value of the sum to zero, otherwise the program does not calculate the sum of the numbers from 1 to n since the sum variable was used above in another computation
		// Question: what is the value of the sum at the end of the program if we do not set the value of the sum to zero at line 35?
		// If you do not know the answer comment out the sum = 0; at the line 35, then save, compile and run the Java program. What is the value of the sum? Please note: if you modified the program as recommended above make sure that you include back the line sum = 0; to ensure that the sum of the numbers from 1 to n is calculated below
		// for loop
		for (int j = 1; j <=n ; j = j + 1){
			sum = sum + j; // add the current value of sum and the current value of j, and then store the new result in sum
		}
		// output
		System.out.println(sum);


	} // ends body of the main

} // ends body of class


