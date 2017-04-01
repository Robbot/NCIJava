/**

Problem 3 of Selection Statements Lab

@author HDCOMP students & a e chis


*/

import java.util.Scanner;

// declare the class named BloodApp
public class BloodApp {

    // declare the main method
	public static void main(String args[]){
		
		// declare a variable named input of type Scanner, and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		

		// declare a variable named b1 of type Blood, and create an object of type Blood using the constructor without parameters
		Blood b1 = new Blood();
		
		
		// prompt the user for age and blood type
		// prompt the user for age
		System.out.println("age: ");
		int a =  input.nextInt();
		// use the setter method setAge() to set/assign the age a provided by the user into the b1's age
		b1.setAge(a);
		
		// prompt the user for blood type
		System.out.println("blood type");
		String bloodType = input.next();
		// use the setter method setType() to set/assign the blood type provided by the user into the b1's type
		b1.setType(bloodType);
			
		// processing
		// call the method computeDonorInfo() on the object b1 to compute the message based on the user's age and blood type
		b1.computeDonorInfo();
		
		// output
		// call the getter method getMessage() on the object b1 to retrieve the message
		String info = b1.getMessage();
		// display the message
		System.out.println(info);
        
        // the statements on line 45 and 47 are equivalent with the following statement:		
		//System.out.println(b1.getMessage());
			
    } // ends the main method
    
} // ends the class


