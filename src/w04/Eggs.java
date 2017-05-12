/**

Problem 2
Read the next problem, and then draw/write, on paper, the Class Diagram
to plan the classes you will need to write to develop the application.

John the farmer has tasked his son with collecting the eggs from the
chicken cage each morning and putting them in boxes of 1 dozen eggs each.
Unfortunately, John’s son Joe is having trouble working out how many boxes
he will need each morning. You have been asked to develop a java application 
to allow Joe to enter the number of eggs he has collected. The application
should then calculate and display how many boxes can be filled and how
many eggs Joe will have leftover.
Your application should use instantiable classes to separate the calcula-
tions from the user input and output.
Hint: there are 12 eggs in 1 dozen.

Eggs -- the instantiable class

@author adriana e chis

*/
package w04;
public class Eggs {

	// declare a constant
	private final int DOZEN = 12 ;

	// declare instance variables/ data members
	private int eggsCount;
	private int boxesCount;
	private int leftEggsCount;

	 // declare a constructor without parameters
	 public Eggs(){
	     // the constructor without parameters initializes the instance variables to their default values, in this case 0 (because all the instance variables have the data type int)
	     // the constructor without parameters performs, in this example, the following initializations by default
		 // eggsCount = 0;
		 // boxesCount = 0;
		 // leftEggsCount = 0;
	 }

	 // declare setter methods -- one setter method for each of the instance variables a user can provide values for
	 public void setEggsCount(int eggsCount){
		 this.eggsCount = eggsCount;
	 }

	 // declare getter methods -- one getter method for each of the instance variables a user could retrieve/read
	 public int getBoxesCount(){
		 return boxesCount;
	 }

	 public int getLeftEggsCount(){
		 return leftEggsCount;
	 }


	 //declare the compute method that performs the processing (i.e. computations)
	 public void calculateMetrics(){
		// compute the number of box needed to store the eggs
		boxesCount = eggsCount / DOZEN;

		// compute the leftover eggs
		leftEggsCount = eggsCount % DOZEN;
	 }
	 
}


