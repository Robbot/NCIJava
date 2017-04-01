/**
1D Arrays
 
Problem 6
Develop an application which creates multiple objects of type Person (class
Person is available on Moodle under Topic 8 in the folder Solutions: Arrays
Problems), store them in an array, retrieve the objects from the array and
call different methods on these objects.

Search the array of Person objects and dislay the name of only the Person objects who enjoy reading

@author HDCOMP students & a e chis
*/

import java.util.Scanner;
public class PersonArrayApp{
	
	public static void main(String args[]){
	
		// declare a variable named in of type Scanner, and create an object of type Scanner
		Scanner in = new Scanner(System.in);
		
		int n; // will store the number of objects to be created
		System.out.println("How many objects?");
		n = in.nextInt(); // read the number provided by the user
		
		// declare an array of type Person
		Person people[];
        // create an array to store up to n objects of type Person
		// by default each element of the array is initialized with the default value of the corresponding type, which in this case is null
		people = new Person[n];

		// input		
		// declare a variable named name of type String to store the name of a person
		String name;
		// declare a variable of type boolean to store whether a person enjoys reading or not
		boolean reads;
		// use a loop to take the input from the user, in each iteration create an object of type Person using the given input, and store it in the array
		for (int i =0; i<people.length; i++){
		    // prompt the user to enter a name
			System.out.println("enter name:");
			// read, from the keyboard, the name and store it in the variable name
			name = in.next();
			// prompt the user to enter whether the person enjoys reading
			System.out.println("does enjoy reading?(true/false):");
			// read, from the keyboard, whether the person enjoys reading or not and store it in the variable reads
			reads = in.nextBoolean();
			
			// declare a variable named p of type Person, and create an object of type Person using the constructor which takes in the two pieces of information provided by the user
			Person p = new Person(name, reads);
			// store/assign the object of type Person in the array at index i
			people[i] = p;			
		}
		
		// processing + output
		// search (i.e. traverse) the array and display the name only for those Person objects who enjoy reading
		for (int i =0; i<people.length; i++){

            // retrieve the Person object located at index i in the people array
			Person p = people[i];

			// call/invoke the getter method getEnjoysReading() to retrieve whether the person enjoys reading
			reads = p.getEnjoysReading();

			// check if the person enjoys reading, and if so, display the name of that person
			if (reads == true){
			    // call/invoke the getter method name() to retrieve the name of the person
				name = p.getName();
				// display the name
				System.out.println(name);
			} // ends if
			
		} // ends for
		
	} // ends main
	
} // ends class


