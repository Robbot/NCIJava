/**

Arrays Problems.pdf
2D Arrays

Problem 3

computes the average of the elements from a 2D array

computes the maximum of the elements from a 2D array

@author a e chis

*/
public class RainfallAvgMax{
	// declare instance variable
	private double[][] rain;
	
	// instance variable to store the average
	private double average;
	
	// instance variable to store the max
	private double max; 
	
	// declare constructors
	public RainfallAvgMax(){
        // the instance variables are initialized with their default values, namely rain with null, and average and max with 0.0			
	}
	
	// declare setter methods
	// setter method to assign/store a 2D array of double elements to the instance variable rain
	public void setRain(double[][] r){
		rain = r;
	}


	// declare getter method
	// getter method to retrieve the average
	public double getAverage(){
		return average;
	}

	
	// getter method to retrieve the max (i.e. the maximum)
	public double getMax(){
		return max;
	}
	
	// declare processing methods
	// compute the average of all the numbers in the 2D array
	public void computeAvg(){
	
		double sum = 0; // initialize the sum with zero (why zero? because zero is the neutral/identity element for addition)
		int counter = 0; // local variable to keep track of the number of elements in the array
		
				
        // traverse the 2D array by using 2 loop statements
        // one loop to traverse the rows
		for (int row=0; row < rain.length; row++){
		    // for the current row use another loop to traverse its elements (i.e. columns)
			for (int col=0; col< rain[row].length; col++){
				
				// add the current element from the array to the sum. The current element from the array is located in the row with the index given by row variable and in the column with the index given by the col variable.
				sum	= sum + rain[row][col];
				
				counter += 1; // we are traversing another element, hence we increase the counter to keep track of the number of elements we have seen so far
				
			}			
		}
		
		// calculate the average of all the elements in the array
		average = sum/counter;			
	}
	

	public void calculateMax(){

        double currentElement;
   		// initialize the maximum with the first value of the 2D array located at row 0 and column 0
		max = rain[0][0]; 
		// to compute the maximum value of the 2D array's values traverse the 2D array, and at each iteration check how does the current value of the 2D array compare to the current maximum value stored in the max instance variable		
		for (int row = 0; row < rain.length; row++){
			for (int col = 0; col < rain[row].length; col++){
				currentElement = rain[row][col]; // retrieve the current element from the array
				// compare with the current maximum
				if (max < currentElement){ // if the value of max instance variable is lower than the current element from the array rain then update the max with that value
					// a new maximum value has been found
					max = currentElement; // store the value of the currentElement in the max 
				}
			}
		}
	}		
}


