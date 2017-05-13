package w09;
/**

1D Arrays
Problem 4

calculates the maximum value of all the elements from a 1D array
    
@author HDCOMP students and a e chis

*/
import java.util.Scanner;
public class ArrayMaxApp{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int n; // will store the size of the array
		// prompt the user to provide the size of the array
		System.out.println("how many numbers?");
		// store/assign the value provided by the user in variable n
		n = in.nextInt();
		
		//1. declare an array named numbers to store integer elements, 2. create an array with the length given by the value of n. the elements of the array are initialized with their default value, in this case that is 0
		int numbers[] = new int[n];
		
        // input
		// use a loop to promt the user to input the numbers
		// in each iteration of the loop store the number provided by the user in the numbers array at the index i
		for (int i=0; i< numbers.length; i++){
			System.out.println("enter value");
            // store/assign the value provided by the user in the array named numbers at the index i
			numbers[i] = in.nextInt(); 
		}
		
	    // processing: compute the maximum of all the numbers from the array
	    // declare a local variable named max of type int
		int max;
		// store/assign the first element of the array in/to the max variable
		max = numbers[0];
		 // traverse the array and calculate the maximum value (note that the traversal starts with the second element of the array, namely the element located at index 1, because the max variable already contains the value of the first element and it wouldn't make sense to comapare the first element with the max variable)
		for (int i = 1; i < numbers.length; i++){
		    
		    // if the value stored in max variable is lower than the current element of the array located at index i then update the max with the current element
			if (max < numbers[i]){
				// update the max with the current value (i.e. the element from the array located at the index i)
				max = numbers[i];
			} // ends if
			
		} // ends for
		
			
		// output
		System.out.println("max is: " + max);		

	} // ends main
	
} // ends class


