package w06;
/**
Problem 1

Power1 
	-- uses the instantiable class PowerOfTwo
	-- allows the user to calculate 3 times the value of a number raised to the power of 2
	
@author HDCOMP students & a e chis
*/

import java.util.Scanner;
public class Power1 {
	public static void main(String args[]){
		
		// declare a variable named sc of type Scanner, and create an object of type Scanner
		Scanner sc = new Scanner(System.in);
		
		// declare a variable named num to store the number provided by the user via keyboard
		int num;
		
		// declare a variable of type PowerOfTwo named obj, and create an object of type PowerOfTwo
		PowerOfTwo obj = new PowerOfTwo();
		
		// we use a loop statement because the problem tells us to allow the user to perform the same operation 3 times
		// we use a counter-controlled loop (i.e. either a for, a while or a do while loop) because at the time Java starts executing the loop statement the number of iterations (i.e. repetitions) is known, namely there are 3 iterations
		for (int i = 0; i < 3; i = i + 1) {
            
            // input
			// prompt the user to enter a number
			System.out.println("enter number");
			num = sc.nextInt();			
            // use the setter method setN() to assign/store in the instance variable named n of the object obj the number provided by the user and saved in the local variable num above
			obj.setN(num);
			
			// processing
			// invoke/call the method power() on object obj to calculate the value of the number raised at the power of 2
			obj.power();
			
			// output
			// use the getter method getResult() to retrieve the value of the number raised at the power of 2
			int res = obj.getResult();
			System.out.println(res);
			
		} // ends for loop	
		
	} // ends main method
	
} // ends class
