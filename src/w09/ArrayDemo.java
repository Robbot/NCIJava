package w09;
import java.util.Scanner;

public class ArrayDemo {

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
		// print the first element from the array
		System.out.println(myArray[0]);
		// print the last element from the array
		int size = myArray.length;
		System.out.println(myArray[size-1]);
		
	}
	
}






