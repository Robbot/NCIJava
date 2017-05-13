package w09;
import java.util.Scanner;

public class ArrayPrintDemo {

	public static void main(String args[]){
		
		// declare
		int myArray[];
		// create the array with size 5
		myArray = new int[5];

		Scanner in = new Scanner(System.in);
		
		// input		
		for (int i = 0; i< myArray.length; i++ ){
			System.out.println("enter number");
			myArray[i] = in.nextInt();
		}
		
		// output
		// print first element 
		System.out.println("first element: " + myArray[0]);
		// print last element 
		int size = myArray.length;
		System.out.println("last element: " + myArray[size-1]);
		
		// display the content of the array
		for (int i = 0; i< myArray.length; i++ ){
			// retrieve the element located at index i in the array, and display it
			System.out.println(myArray[i]);			
		}		
	}	
}






