package w06;
/**
Problem 2

Power2 
	-- uses the instantiable class PowerOfTwo
	-- first, asks the user how many times he/she wants to perform the same operation
	-- then, allows the user to calculate the value of a number raised to the power of 2, the number of times the user requested
	
@author HDCOMP students & a e chis
*/

import java.util.Scanner;
public class Power2 {
	public static void main(String args[]){
		
		// declare a variable named sc of type Scanner, and create an object of type Scanner
		Scanner sc = new Scanner(System.in);
		
		// declare a variable named num to store the number provided by the user via keyboard
		int num;
		
		// prompt the user to enter how many times he/she wants to perform the same operation
		System.out.println("how many times? ");
		int times = sc.nextInt();
		
		// declare a variable of type PowerOfTwo named obj, and create an object of type PowerOfTwo
		PowerOfTwo obj = new PowerOfTwo();
		
		// we use a loop statement because the problem tells us to allow the user to perform the same operation multiple times, namely the number of times stored above in the times variable
		// we use a counter-controlled loop (i.e. either a for or a while or a do while loop) because at the time Java starts executing the loop statement the number of iterations (i.e. repetitions) is known, namely the value stored in the times variable
		for (int i = 0; i < times; i = i + 1) {
		
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
		
	}  // ends main method

} // ends class
