/**
calculates exams average mark

A class of students took an exam. Develop an application that takes an
arbitrary number of marks (i.e. we do not know the exact number of marks,
that is the user decides when there are no marks to be entered) and calculates
and displays the average mark of the entire class on the exam. The marks
are integers in the range [0,100].

@author a e chis

TODO: Compile, then run the application to test it for different marks values.

Remember! We must all the time test an application to ensure it works as described in the specification.

*/

import java.util.Scanner;

public class ExamMarks{
	public static void main(String args[]){
		// declare local variables
		Scanner sc = new Scanner(System.in);

		int sum, counter;
		double average; // to store the average mark
		String ans;
		
		sum = 0; // to store the sum -- needed to compute the average mark
		counter = 0; // counter to keep track of the number of marks entered -- needed to compute the average mark

		ans = "yes"; // sentinel which decides when all the marks have been entered -- initialization of the loop control variable
		while (ans.equals("yes")){ // loop condition
			// prompt the user to enter a mark
			System.out.println("enter mark");
			int mark = sc.nextInt();

			// update the sum and the number of marks entered so far
			// add to the current sum the new mark entered
			sum += mark; // sum = sum + mark;
			// increment the number of marks entered so far
			counter++; // counter = counter + 1;
			
			// prompt the user whether he/she wants to enter another mark
			System.out.println("do you enter another mark? (type yes to continue)");
			ans = sc.next(); // progression // read one token (i.e. one word)

			// the program should work irrespective of how the user enters the answer (i.e. lower case, upper case, or a combination of upper and lower case), therefore, because the sentinel-controlled loop checks the answer against the lower case answer "yes" we convert the user's answer to lower case
			// convert the user's answer to lower case and save the converted answer into the same variable because the variable ans is used in the loop's boolean condition
			ans = ans.toLowerCase();			
		}

		// at this stage all the marks have been entered, and we can compute the average mark
		average = (double) sum/counter;
		System.out.println("average " + average);
		System.out.println("no of marks entered: " + counter);	
	}
}
