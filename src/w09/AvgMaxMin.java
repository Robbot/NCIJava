package w09;
/**
Arrays Problems.pdf
Problem 5:

AvgMaxMin -- instantiable class to compute
    -- the average of the elements from a 1D array
    -- the maximum value of all the elements from a 1D array
    -- the minimum element of the array
    
Use instantiable classes.
    
@author a e chis
*/


public class AvgMaxMin {
	// declare instance variables
	private int numbers[];  // array to store the numbers
	private double average; // to store the average value of the numbers from the array -- to be computed
	private int max; // to store the maximum value of the numbers from the array -- to be computed
    private int min; // instance variable to store the minimum element of the array -- to be computed
    
	public AvgMaxMin(){
	    // the instance variables are initialized with their default values, that is null for numbers, 0.0 for average, and 0 for max
	}

    // declare setter methods
	// setter method to store an array of integer elements in the instance variables numbers
	public void setNumbers(int numbers[]){
		this.numbers = numbers;
	}
	
	// declare getter methods	
    // getter method to retrieve the average
	public double getAverage(){
		return average;
	}
	
	// getter method to retrieve the max (i.e. the maximum element from the array)
	public int getMax(){
		return max;
	}
	
    // getter method to retrieve the min (i.e. the minimum element from the array)
	public int getMin(){
		return min;
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

	
	
	// processing method: compute the maximum of all the numbers from the array
	// for demo purposes, please note that this method computes and returns the maximum element from the array
	public int computeMax(){
		// store the first element of the array in the max variable
		max = numbers[0];
		
        // traverse the array and calculate the maximum value (note that the traversal starts with the second element of the array, namely the element located at index 1, because the max variable already contains the value of the first element and it wouldn't make sense to compare the first element with the max variable i.e. with itself)
		for (int i = 1; i < numbers.length; i++ ){
			// if the current element of the array located at index i is higher than the value stored in max then update the max with the current element
			if ( numbers[i] > max){ // we found another new greater value  than the one currently stored in max
				// update the max with the current value (i.e. the element from the array located at the index i)
				max = numbers[i];
			}
		}
		return max;
	}
	
	
	// processing method: compute the minimum of all the numbers from the array
	public void calculateMin(){
		// traverse the array and calculate the minimum element of the array

		// initialize the min with the first element of the array
		min = numbers[0];

		// traverse the array from the second element since we stored already the first element in the instance variable min (and it wouldn't make sense to compare the first element with the min variable i.e. with itself)
		for (int i = 1; i < numbers.length; i++){
			
			if (numbers[i] < min) { // if the current element located in the array numbers at index i is lower than the value stored in the min then update the min with the current element (i.e. we found a new smaller value than the one currently stored in min)
				min = numbers[i]; // update the min with the current value (i.e. the element from the array located at the index i)
			}
		}
	}
	
}


