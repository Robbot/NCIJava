package w06;
/** 
Lab: Repetition Statements

Using Problem 6 of Selection statements lab, that is Theatre2.java and The-
atre2App.java, solve each of the problems below:

Practice work: Problem 12: Theatre 7

Modify  Theatre  6  so  that  there  is  an  upper  limit  of  4  tickets  per  person.
When this limit is reached, the user should not be able to purchase any more
tickets.


Theatre7App.java 
    -- prompts the user to input a day and then
	-- prompts the age from the user and uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age
	-- then asks the user whether they would like to check another ticket. If they anser yea, the application should run again, if they anser no, the application should end -- there is an upper limit of 4 tickets per person -- that means the loop finishes when either the user reached the limit of 4 tickets or the user does not want to buy any more tickets whichever happens first
	-- when the programme exits the loop, the total cost of the tickets is displayed
	-- an implementation using a do while loop
	

@author a e chis

*/

import java.util.Scanner;
public class Theatre7App {
	
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
		
		// declare a variable ans which stores the user's anser to show whether she/he wants to perform another computation
		// we do not have to initialize the ans variable because we are using a do while loop (i.e. the condition is tested at the bottom of the loop after the loop body was executed once), and the problem says to allow the user to check the cost of one ticket and then ask the user would they like to check another 
		String ans;
		int totalCost = 0;  // keep track of the total price for all tickets
		int ticketsCount = 0; // keep track of the number of tickets as there is a limit of 4 tickets per customer
		do {
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
			    totalCost = totalCost + p; // add to the total cost the price of the current ticket
		    } // ends else
		    
		    // a price ticket has been computed, increment the ticketsCount variable
		    ticketsCount++;
    
            
            if (ticketsCount !=4 ) { 
        		// ask the user whether he/she would like to check another ticket
			    System.out.println("continue? (yea to continue, anything else will stop the program)");
			    ans = input.next(); // read the user's anser (i.e. one word)
			    ans = ans.toLowerCase(); // convert the anser provided by the user to lower case so that the user can use either lower case, upper case or a combination of the two. if we do not convert to lower case then when the user enters for example "yEA" the loop terminates
			} else { // when the limit of 4 tickets is reached do not ask the user whether he/she would like to buy another ticket, instead force the loop to terminate by storing in the ans variable any String different than "yea"
			    ans = "no";
			    // alternatively, we could use a break statement to terminate the do while loop
			    // break;
			}
			
		} while (ans.equals("yea")); // as long as the user enters "yea" the body of the do while loop is run again
		
		System.out.println("You should pay " + totalCost + " for all your tickets");
		
	} // ends main

} // ends class
