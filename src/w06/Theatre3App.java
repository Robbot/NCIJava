package w06;
/** 
Lab: Repetition Statements

Using Problem 6 of Selection statements lab, that is Theatre2.java and The-
atre2App.java, solve each of the problems below:

Practice work: Problem 8: Theatre 3

Modify the theatre application to allow the user to check the cost of 5 tickets.
The application should accept the age from the user 5 times, calculating and
outputting the cost each time. 


Theatre3App.java 
    -- allows the user to check the cost of 5 tickets
	-- prompts the user to input a day and then
	-- prompts the age from the user 5 times
	-- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age

@author a e chis

*/

import java.util.Scanner;
public class Theatre3App {
	
	public static void main(String args[]){
		
		// declare local variables
		String d;
		int age, p;
		
		// declare a variable of type Scanner named input, and create an object of type Scanner to allow input from the keyboard
		Scanner input = new Scanner(System.in);
		
		// prompt the user to input a day
		System.out.println("enter day");
		d = input.next(); // reads a single word from the keyboard
		
		// declare a variable named tObj of type Theatre2
		Theatre2 tObj;
		// create an object of type Theatre2 using the constructor which does not take in any data
		tObj = new Theatre2();
		// use (i.e. by calling/invoking) the setter method setDay() to store in the instance variable named day of the object tObj the day provided by the user
		tObj.setDay(d);		
		
		// next, we use a loop statement because the problem tells us to allow the user to check the cost of 5 tickets.
		// we use a counter-controlled loop (i.e. either a for, a while or a do while loop) because at the time Java starts executing the loop statement the number of iterations (i.e. repetitions) is known, namely there are 5 iterations
		for (int i = 0; i < 5; i = i + 1) {
            // we assume that the user will buy the tickets for the same day, otherwise we will have to prompt the user to provide the day in the loop too
		    // prompt the user to input the customer's age
		    System.out.println("enter age:");		
		    age = input.nextInt();
		
		
		    // use (i.e. by calling/invoking) the setter method setAge() to store in the instance variable named age of the object tObj the age provided by the user
		    tObj.setAge(age);
		
		    // processing: calculate the price of a tiket based on the given day and age
		    // call/invoke the method calculatePrice() on the object tObj
		    tObj.calculatePrice();
		
		    // output
		    // invoke/call the getter method getPrice() to retrieve the price of the ticket
		    p = tObj.getPrice();
		    // it is not mandatory, but we can display a user friendly message in case that the day is not valid, and therefore there is a negative value in the p variable (recall that the calculatePrice() method of the Theatre2 class assigns/stores -1 in the price instance variable if the day is invalid)
		    if (p < 0){
			    System.out.println("invalid input");
		    } else {
			    System.out.println("price is: " + p);
		    } // ends else
		    
		} // ends for
		
	} // ends main

} // ends class
