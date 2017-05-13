package w09;
/** 
Problem 3: calculates the average of the elements from a 1D array. Use instantiable classes.

@author a e chis
*/

public class Avg {
	// declare instance variables
	private int numbers[]; // array to store the numbers
	private double average; // to store the average value of the numbers from the array -- to be computed


	public Avg(){
	    // the instance variables are initialized with their default values, that is null for the 1D numbers array, and 0.0 for average
	}

    // declare setter methods
	// setter method to store an array of integer elements in the instance variables numbers
	public void setNumbers(int numbers[]){
		this.numbers = numbers;
	}

    // processing method: compute the average of all the numbers from the array
	public void calculateAverage(){
	    // declare local variables
		int sum; // to store the sum of all the elements from the array
		int currentElement; // to store the current element from the array

		sum = 0; 
		for (int i = 0; i < numbers.length; i++){
			// retrieve the element at index i
			// currentElement = numbers[i];
			// update the sum
			// sum = sum +  currentElement;
			// alternatively, the above 2 statements can be written in one single line
			// update the sum by adding to the previous sum the value of the current element from index i			 
			sum = sum + numbers[i];
		}

        // compute the average (we type cast one of the operands to double so there is an accurate result for the average, otherwise an integer division would be performed)
		average = (double) sum/numbers.length;
	}

    // getter method to retrieve the average
	public double getAverage(){
		return average;
	}
}


