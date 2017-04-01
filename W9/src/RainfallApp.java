/**
Arrays Problems.pdf
2D Arrays

Problem 1: compute the average of the rainfall values stored each day for 4 weeks

RainfallApp
    -- prompts the user to input the rainfall values for 4 weeks
	-- calculates the average of the rainfall
	-- displays the values from the rainfall 2D array

@author a e chis
*/

import java.util.Scanner;
public class RainfallApp{
	public static void main(String args[]){
		// declare local variables
		// declare AND create a 2D array with 4 rows (corresponding to 4 weeks) and 7 columns (corresponding to 7 days)
		int rainfall[][] = new int[4][7];
		
		// input
		Scanner sc = new Scanner(System.in);
		// prompt the user to input data: traverse the 2D array by using 2 loop statements, and store the values provide by the user
		for (int row = 0; row < rainfall.length; row++){
			for (int col = 0; col < rainfall[row].length; col++){
				System.out.print("enter value week:" + (row+1) + " day " + (col+1) + ": ");

				// read the value entered by the user and save it in 2D array in the row with index row and column with index col
				rainfall[row][col]= sc.nextInt();
			}
		}
		
		// processing: calculate the sum of all elements of the array AND how many elements the array contains
		int sum = 0; // declare and initialize the sum to 0
		double average; 
		int counter = 0; // the number of elements in the 2D array
		for (int row = 0; row < rainfall.length; row++){
			for (int col = 0; col < rainfall[row].length; col++){
				sum = sum + rainfall[row][col]; // add the current element from the array rainfall to the sum
				counter++; // another element has been added above to the sum, that is the element from the array at the row row and column col
			}
		}
		// compute the average of all the elements in the array
		average = (double) sum/counter;
		
		// output: display the average
		System.out.println();
		System.out.println("average: " + average);
		
		// the problem finished above. the code below displays the content of the 2D array
		// output: display the 2D values -- i.e. the data the user entered
		System.out.println();
		System.out.println("The rainfall values are: ");
		for (int row =0 ; row < rainfall.length; row++){
			for (int col = 0; col < rainfall[row].length; col++){
				System.out.print(rainfall[row][col] + " "); // retrive the element from the array located at the row row and column col			
			}
			System.out.println();
		}		
	}
}
