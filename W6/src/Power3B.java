/**
Problem 3

Power3B

	-- uses the instantiable class PowerOfTwo
	-- allows the user to calculate the value of a number raised to the power of 2, and then asks the user whether they would like to calculate another number raised to the power of 2. If they answer yes, the application should run again, otherwise, the application should end.
	-- an implementation using a while loop
	
@author HDCOMP students & a e chis
*/

import java.util.Scanner;
public class Power3B {
	public static void main(String args[]){
	
		// declare a variable named sc of type Scanner, and create an object of type Scanner
		Scanner sc = new Scanner(System.in);
		
		// declare a variable named num to store the number provided by the user via keyboard
		int num;
		
		// declare a variable of type PowerOfTwo named obj, and create an object of type PowerOfTwo
		PowerOfTwo obj = new PowerOfTwo();
		
		// declare a variable which stores the user's answer to show whether she/he wants to perform another computation
		// we MUST initialize the answ variable because we are using a while loop (i.e. the condition is tested at the beginning of the loop) and the problem says to allow the user to calculate the value of a number raised to the power of 2 one time, and then to ask the user whether he/she would like to perform another computation
		String answ = "yes";
		 while (answ.equals("yes")) { // as long as the user enters "yes" the body of the loop is run again
		 
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
			
			// ask the user whether he would like to perform another computation
			System.out.println("continue? (yes to continue)");
			answ = sc.next(); // read the user's answer (i.e. one word)
			answ = answ.toLowerCase(); // convert the answer provided by the user to lower case so that the user can use either lower case, upper case or any combination of the two. if we do not convert to lower case then when the user enters for example "yES" the loop terminates
			
		} // ends while loop
		
	} // ends main method
	
} // ends class



