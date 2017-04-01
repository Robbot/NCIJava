/**

Arrays Problems.pdf
2D Arrays

Problem 4

RainfallAvgMaxMinApp
		-- prompts the user to enter the rainfall values recorded each day for 4 weeks
		-- uses the instantiable class RainfallAvgMaxMin to compute the average of the elements from a 2D array
		-- display the average rainfall value
		-- uses the instantiable class RainfallAvgMaxMin to compute the maximum of the elements from a 2D array
		-- display the maximum rainfall value
		-- uses the instantiable class RainfallAvgMaxMin to compute the minimum of the elements from a 2D array
		-- display the minimum rainfall value

@author a e chis

*/


import java.util.Scanner;

public class RainfallAvgMaxMinApp{
	
	public static void main(String[] args){
		
		// declare local variables
		// declare a 2D array variable to store the values provided by the user
		double ra[][];
		
		Scanner sc = new Scanner(System.in);
		
		// the problems says to record the average rainfall across 4 weeks daily
		int weeks = 4; // depending on the problem, we could prompt the user to give us the number of rows for the array
		int days = 7; // depending on the problem, we could prompt the user to give us the number of columns for the array
		
		// create a 2D array with as many rows as the value stored in variable weeks (4 rows in this case) and as many columns as the value stored in variable days (7 columns in this case)
		ra = new double[weeks][days];
		
		// alternatively, we could ask the user to provide the dimensions for the array (i.e. the number of rows and columns)
		System.out.println("number of weeks: ");
		weeks = sc.nextInt();
		System.out.println("number of days per week: ");
		days = sc.nextInt();

		// create a 2 D array with as many rows as the user provided for weeks and as many columns as the user provided for days
		ra = new double[weeks][days];
		
		// input
		// prompt the user to input data: traverse the 2D array by using 2 loop statements, and store the values provide by the user
		for (int row = 0; row < ra.length; row++){
			for (int col = 0; col < ra[row].length; col++) {
				System.out.print("enter rainfall value for week : " + (row + 1) + " day " + (1 + col) + ": ");
				ra[row][col] = sc.nextDouble();
			}
		}


		// once we have the values from the user we can use the instantiable class to perform the actual computations
		// declare the variable myRain of RainfallAvgMaxMin type, and create and object of tye RainfallAvgMaxMin
		RainfallAvgMaxMin myRain = new RainfallAvgMaxMin();
		
		// pass the rainfall values provided by the user to the myRain's instance variable rain via its setter method
		myRain.setRain(ra);
		
		// processing: invoke/call the method computeAvg() to calculate the average rainfall
		myRain.computeAvg();
		
		// output
		// use the getter method to retrieve the average rainfall
		double a = myRain.getAverage();
		System.out.println("rainfall average is " + a);


        // processing: invoke/call the method computeMax() to calculate the maximum rainfall
		myRain.calculateMax();
		
		// output
		// use the getter method to retrieve the maximum rainfall value
		a = myRain.getMax();
		// display the maximum rainfall value	
		System.out.println("the maximum rainfall is " + a);		
	
		
		// processing: invoke/call the method computeMin() to calculate the minimum rainfall
		myRain.calculateMin();
		
		// output
		// use the getter method to retrieve the minimum rainfall value
		a = myRain.getMin();
		System.out.println("the minimum rainfall is " + a);
		
	}
}

