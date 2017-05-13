package w09;
/**

computes the average rainfall

@author HDCOMP students & a e chis
*/

import java.util.Scanner;

public class RainfallAvgApp{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		// declare a 2D array
		double[][] myArray;
			
		// the problems says to record the average rainfall across 4 weeks daily
		int weeks = 4; // depending on the problem, we could prompt the user to give us the number of rows for the array
		int days = 7; // depending on the problem, we could prompt the user to give us the number of columns for the array
		
		// create a 2D array with as many rows as the value stored in variable weeks (4 rows in this case) and as many columns as the value stored in variable days (7 columns in this case)
		myArray = new double[weeks][days];
		
		
		// input
		// prompt the user to input data: traverse the 2D array by using 2 loop statements, and store the values provide by the user
		for (int row=0; row < myArray.length; row++){			
			for (int col=0; col< myArray[row].length; col++){
				int wno = row + 1;
				int dayno = col + 1;
				System.out.println("enter rainfall value for week: " + wno + " and day: " + dayno);
				// assign/store in the array named myArray at the row with index row and at column with index col the value provided by the user
				myArray[row][col] = in.nextDouble();				
			}
		}
		
		
		// once we have the values from the user we can use the instantiable class to perform the actual computations
		// declare the variable named myObj of RainfallAvg type, and create and object of RainfallAvg type
		RainfallAvg myObj = new RainfallAvg();
		
		
		// call/invoke the setter method setRain() to pass the rainfall values provided by the user to myObj's instance variable rain
		myObj.setRain(myArray);
		
		// processing
		// call/invoke the method computeAvg() to calculate the average rainfall
		myObj.computeAvg();
		
		// output
		// call/invoke the getter method getAverage() to retrieve the average rainfall
		double a = myObj.getAverage();
		System.out.println("average rainfall: " + a);
	}
}


