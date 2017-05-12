/**
Lab: Instantiable Classes

Problem 4

Route 66 is a highway in the USA with a length of 3,945 Km.  A cross country Bicycle race has been scheduled where people work in teams to cycle this highway non-stop from one end to the other.  The race has a rule that no one cyclist can cycle for more than 15 hours at a time.

You have been asked to develop an application that allows the user to enter the team’s projected average speed in kilometres per hour and the number of members on the team.  The application should then calculate and display:

-- the time it will take the team to complete the journey,

-- the number of full 15 hour blocks to be cycled,

-- how many full blocks each team member will cycle,

-- how many hours would be leftover at the end. 

Your application should be developed using instantiable classes.  All classes should be correctly commented and formatted.  Save your instantiable class as Route66.java


Route66App.java 
	-- takes input from the user
	-- uses the Route66 -- the instantiable class to perform different metrics computation
	-- outputs the metrics calculated by an object of type Route66 -- i.e. the instantiable class

@author adriana e chis
*/

package w04;
import java.util.Scanner;
public class Route66App{
	public static void main(String args[]){

		// declare local variables
		double speed;
		int membersCount;		
        
        // declare a variable called sc of type Scanner to be able to work with an object of type Scanner
		Scanner sc;
        // declare a variable called routeCalc of type Route66 to be able to work with an object of type Route66
		Route66 routeCalc;

		// input		
		// create an object of type Scanner to allow input from the keyboard
		sc = new Scanner(System.in);
		
		// prompt the user to enter the required information and read the input from the user
		System.out.println("enter the team's average speed in km per hour");
		speed = sc.nextDouble();
		System.out.println("enter the number of team members");
		membersCount = sc.nextInt();
		
		// create an object of type Route66
		routeCalc = new Route66();

		// call/invoke the setter methods to assign the values provided by the user to the routeCalc object's instance variables
		// set/update the value of the object's instance variable called speed with the value provided by the user via keyboard
		routeCalc.setSpeed(speed);
		// set/update the value of the object's instance variable called numMembers with the value provided by the user via keyboard
		routeCalc.setNumMembers(membersCount);
		
		// processing
		routeCalc.calculateMetrics();

		// output
		System.out.println("==================================================================================================================================");
		// the problem does not ask to display the race details, but makes the application more user friendly
		System.out.println("Race details: " + routeCalc.getRaceDetails());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		// the problem asks us to display the following metrics:
		// output the metrics calculated by routeCalc
		// retrieve each metric value using the corresponding getter method
		double value1 = routeCalc.getTime();
		System.out.println("estimated time for the team to complete the journey: " +  value1 + " hour(s)");
		int value2 = routeCalc.getNumBlocks();
		System.out.println("the number of full 15 hour blocks to be cycled: " + value2);
		value2 = routeCalc.getNumBlocksPerMember();
		System.out.println("the number of full blocks each team member will cycle: " + value2);
		value1 = routeCalc.getLeftoverTime();
		System.out.println("the number of hours left at the end: " + value1 + " hour(s)");
		System.out.println("==================================================================================================================================");
	}
	
}

