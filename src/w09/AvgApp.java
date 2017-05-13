package w09;
/** 
Problem 3: calculates the average of the elements from a 1D array. Use instantiable classes.


AvgApp
    -- prompts the user to input the number of values (i.e. size of the array) he/she wants to enter
	-- prompts the user to enter "size" numbers and saves them in an array
	-- uses the instantiable class Avg to compute the average of the numbers stored in an array
	-- displays the average
	
@author a e chis
*/

import java.util.Scanner;

public class AvgApp {
	public static void main(String args[]){
	
		//declare an array named num to store integer elements
		int num[];
		
		Scanner input = new Scanner(System.in);
		// prompt the user to provide the size of the array
		System.out.println("enter the size of the array");
		// declare a variable named size, and store the value provided by the user
		int size = input.nextInt();
		
		// create an array with the length given by the size value. the elements of the array are initialized with their default value, that is 0
		num = new int[size];
		
		// input
		// use a loop to promt the user to input the numbers
		// in each iteration of the loop store the number provided by the user in the num array at the index i
		for (int i = 0; i< size; i++){
			System.out.print("enter value " + (i+1) + ": ");
			// store a value in the array 
			num[i] = input.nextInt();			
		}
		
		// processing
		// declare and create an object of type Avg
		Avg metricsObj = new Avg();
		
		// call/ invoke the setter method -- use the setter to store the numbers provided by the user (and saved above in the array num) in the object's intance variable numbers
		metricsObj.setNumbers(num);
		
        // processing: invoke/call the method calculateAverage() to calculate the average value of the array's elements
		metricsObj.calculateAverage();
		
		// output
		// use the getter method to retrieve the average value
		double a = metricsObj.getAverage();
		// display the average value stored in variable a
		System.out.println("average: " + a);	
		
	}
	
}


