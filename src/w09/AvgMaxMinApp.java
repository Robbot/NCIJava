package w09;
/**

Arrays Problems.pdf
Problem 5:

AvgMaxMinApp
    -- prompts the user to input the number of values (i.e. size of the array) he/she wants to enter
	-- prompts the user to enter "size" numbers and saves them in an array
	-- uses the instantiable class AvgMaxMin to compute the average of the numbers stored in an array
	-- displays the average
	-- uses the instantiable class AvgMaxMin to compute the maximum number stored in an array
	-- displays the maximum
	-- uses the instantiable class AvgMaxMin to compute the minimum number stored in an array
	-- displays the minimum

@author adriana e chis
*/

import java.util.Scanner;

public class AvgMaxMinApp {
	public static void main(String args[]){
	
		//declare an array named numbers to store integer elements
		int numbers[];
		
		Scanner input = new Scanner(System.in);
		// prompt the user to provide the size of the array
		System.out.println("enter the size of the array");
		// declare a variable named size, and store the value provided by the user
		int size = input.nextInt();
		
		// create an array with the length given by the size value. the elements of the array are initialized with their default value, that is 0
		numbers = new int[size];
		
		// input
		// use a loop to promt the user to input the numbers
		// in each iteration of the loop store the number provided by the user in the numbers array at the index i
		for (int i = 0; i< size; i++){
			System.out.print("enter value " + (i+1) + ": ");
			// store a value in the array 
			numbers[i] = input.nextInt();			
		}
		
		// processing
		// declare and create an object of type Avg
		AvgMaxMin metricsObj = new AvgMaxMin();
		
		// call/ invoke the setter method -- use the setter to store the numbers provided by the user (and saved above in the array numbers) in the object's intance variable numbers
		metricsObj.setNumbers(numbers);
		
        // processing: invoke/call the method calculateAverage() to calculate the average value of the array's elements
		metricsObj.calculateAverage();
		
		// output
		// use the getter method to retrieve the average value
		double a = metricsObj.getAverage();
		// display the average value stored in variable a
		System.out.println("average: " + a);
		
		
		// processing: invoke/call the method computeMax() to calculate the maximum element of the array
		// note that unlike the processing method for computing the average (i.e. calculateAverage()) which does not return any value, the method computeMax() returns the maximum value from the array (i.e. an int value); that's why below we save the value returned by the computeMax() method in a variable 
		int m = metricsObj.computeMax();
		// output
		// the processing method computeMax() returned the maximum value, and we saved it above in the variable m, therefore we do not need to use the getter method to retrieve the maximum value again, we can just display the value of the variable m
		System.out.println("max: " + m);
		
				
		// processing: invoke/call the method calculateMin() to calculate the minimum element of the array
		metricsObj.calculateMin();

		// output
		// use the getter method to retrieve the minimum value
		m = metricsObj.getMin();
		// display the minimum value (stored above in the local variable m)
		System.out.println("min is " + m);		
		
	}
	
}


