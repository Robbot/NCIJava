/**

Problem 2
Read the next problem, and then draw/write, on paper, the Class Diagram
to plan the classes you will need to write to develop the application.

John the farmer has tasked his son with collecting the eggs from the
chicken cage each morning and putting them in boxes of 1 dozen eggs each.
Unfortunately, John's son Joe is having trouble working out how many boxes
he will need each morning. You have been asked to develop a java application 
to allow Joe to enter the number of eggs he has collected. The application
should then calculate and display how many boxes can be filled and how
many eggs Joe will have leftover.

Your application should use instantiable classes to separate the calculations from the user input and output.

Hint: there are 12 eggs in 1 dozen.

EggsApp 
	-- takes input from the user
	-- uses the Eggs -- the instantiable class to perform the actual computations

@author adriana e chis

*/

package w04;
import java.util.Scanner;
public class EggsApp{
	public static void main(String args[]){

		// declare local variables (that are variables defined within a method, in this case within the main method)
		int eggsNum, boxesNum, leftEggsCount;
		
        // declare a variable called sc to be able to work with an object of type Scanner
		Scanner sc;
		// create an object of type Scanner to allow input from the keyboard
		sc = new Scanner(System.in);


        // declare a variable called eggsCalc of type Eggs to be able to work with an object of type Eggs
		Eggs eggsCalc;
		// create an object of type Eggs
		eggsCalc = new Eggs();


		// read the input from the user
		System.out.println("enter number of eggs");
		eggsNum = sc.nextInt();
		
		// call/invoke the setter method to assign the value provided by the user 
		// set/update the value of the object's instance variable called eggsCount with the value provided via the keyboard
		eggsCalc.setEggsCount(eggsNum);
		
		// processing
		// call/invoke the method calculateMetrics() of the object eggsCalc
		eggsCalc.calculateMetrics();
		
		// first, retrieve each metric value using the corresponding getter method
		// second, display each result
		// call/invoke the getter method getBoxesCount() to retrieve the number of boxes, and then store the value in the variable boxesNum
		boxesNum = eggsCalc.getBoxesCount();
		// display the value stored in boxesNum local variable
		System.out.println("number of boxes required: " + boxesNum);
		
		// call/invoke the getter method getLeftEggsCount() to retrieve the number of leftover eggs, and store the value in the variable leftEggsCount
		leftEggsCount = eggsCalc.getLeftEggsCount();
		// display the value stored in leftEggsCount local variable
		System.out.println("remaining eggs: " + leftEggsCount);
	}
}
