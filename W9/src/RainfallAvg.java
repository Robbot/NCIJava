/**

computes the average of the elements from a 2D array

@author HDCOMP students & a e chis
*/
public class RainfallAvg {
	
	// declare the instance variables
	
	// instance variable to store the rainfall values
	private double[][] rain;
	
	// instance variable to store the average
	private double average;
	
	
	
	// declare constructors
	public RainfallAvg(){
	    // the instance variables are initialized with their default values, namely rain with null, and average with 0.0	
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
				
			} // ends inner for
			
		} // ends outer for
		
		// calculate the average of all the elements in the array
		average = sum/counter;	
			
	} // ends method
	
	
} // ends class


