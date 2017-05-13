package w09;
/** Problem 2: calculates the average of the elements from an array. the array contains 5 elements.

@author a e chis
*/

import java.util.Scanner;
public class AverageApp {
	
	public static void main(String args[]){
		// declare variables
		// declare an array named numbers to store integer elements AND create the array with 5 elements. the elements of the array are initialized with their default value, that is 0
		int numbers[] = new int[5];

		Scanner input = new Scanner(System.in);
		
		// input 
		// use a loop to prompt the user 5 times to input a number (i.e. the length of the array)
		// each iteration of the loop will store the number provided by the user in the numbers array at the index i
		for (int i = 0; i < 5; i++){
			System.out.print("enter number: ");
			numbers[i] = input.nextInt(); // each iteration of the loop will store the number provided by the user in the numbers array at the index i
		}
		
		// processing
		// calculate the average of all the numbers from the array
		double avg; // variable to store the average
		int sum = 0; // initialize the sum with zero (why zero? because zero is the neutral/identity element for addition)
		int counter; // variable to store the number of elements in an array
		counter = numbers.length; // the number of elements in an array (i.e. numbers in our case) is given by the property length 
		
		// traverse the array to calculate the sum of all the numbers from the array
		for (int i = 0; i < numbers.length; i++){
			sum = sum + numbers[i]; // in each iteration add the current element which is stored in the array at the index i to the sum computed so far
		}

		// compute the average
		avg = (double) sum/counter;
		
		// output
		System.out.println("average mark is: " + avg);
		
		// the problem finished above. the code below displays the content of the array
		for (int i = 0; i < numbers.length; i++){			
			System.out.println("number " + (i + 1) + " is: " + numbers[i]);
		}		
	}
}
