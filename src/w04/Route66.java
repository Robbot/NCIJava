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


Route66.java -- the instantiable class which calculates different metrics according to the problem description

@author adriana e chis
*/
package w04;
public class Route66 {

	// declare instance variables/ data members

	private double speed; // will store the average speed in km per hour
	private int numMembers; // will store the number of members on the team

	private double time; // will store the time (in hours) it will take the team to complete the journey: to be computed
	private int numBlocks; // will store the number of full 15 hour blocks to be cycled: to be computed
	private int numBlocksPerMember; // will store the number of full blocks each team member will cycle: to be computed
	private double leftoverTime; // will store the number of hours that would be left over at the end: to be computed

	// declare (instance) constants
	private final int ROUTE_LENGTH = 3945;
	private final int MAX_TIME_BLOCK_CONTINUOUS_CYCLE = 15;

	// declare a constructor without parameters
	public Route66(){
		//recall: if we do not initialize the instance variables here, they will be initialized with their default values during an object construction, in this case the default value is 0 for the integer instance variables and 0.0 for the double instance variables
	} 

	// declare setter methods
	// declare one setter method for each instance variable the users of this class should provide values for. note that the users of this class are other classes (i.e. the classes that reuse this instantiable class, for example Route66App class)
	
	// declare a setter method to set the value of the speed instance variable
	public void setSpeed(double speed){
		// stores the value of the parameter speed in the instance variable named speed (i.e. this.speed)
		this.speed = speed;
	}

	
	// declare a setter method to set the value of the numMembers instance variable
	public void setNumMembers(int count){
		// stores the value of the parameter count in the instance variable named numMembers
		numMembers = count;
	}

	// declare getter methods
	// declare one getter method for each instance variable whose value should be made available to the other classes

	// declare a getter method to be able to retrieve/get the time
	public double getTime(){
		return time;
	}

	// declare a getter method to be able to retrieve/get the numBlocks
	public int getNumBlocks(){
		return numBlocks;
	}

	// declare a getter method to be able to retrieve/get the numBlocksPerMember
	public int getNumBlocksPerMember(){
		return numBlocksPerMember;
	}

	// declare a getter method to be able to retrieve/get the leftoverTime
	public double getLeftoverTime(){
		return leftoverTime;
	}
	
	
	// declare the method to perform the processing (i.e. computes the metric)
	public void calculateMetrics(){
		// the time it will take the team to complete the race
		time = ROUTE_LENGTH / speed;

		// the number of full 15 hour blocks to be cycled
		numBlocks = (int) time / MAX_TIME_BLOCK_CONTINUOUS_CYCLE;

		// how many full blocks each team member will cycle
		numBlocksPerMember = numBlocks / numMembers;

		// how many hours would be left over at the end
		leftoverTime = time % MAX_TIME_BLOCK_CONTINUOUS_CYCLE;
	}

	// the following method is not required by the problem: the method provides user-friendly details about the race
	public String getRaceDetails(){
		String info = "route: Route66. distance: " + ROUTE_LENGTH  + 
			"km. a cyclist's maximum time block continuous cycle: " + MAX_TIME_BLOCK_CONTINUOUS_CYCLE +
			" hours. average speed " + speed + " kmh.";
		return info;
	}

}
