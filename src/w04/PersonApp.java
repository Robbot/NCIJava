/** 
PersonApp.java demonstrates 
	-- how to reuse the instantiable class Person
	-- how to create several objects/instances of class Person and 
		-- how to use the constructors to initialize an object's attributes/ properties/ state
	-- how to call/invoke an object's method (i.e. displayMe()) to perform its tasks
	
	
@author HDCOMP students and a e chis
*/
package w04;
// declare the class named PersonApp
public class PersonApp {
	
	// declare the main method
	public static void main(String args[]) {
	  
		// declare a variable of type Person
		Person p1;
		// create an object/instance of type Person using the constructor without any parameters
		/* if we use the no-arguments constructor, during the program execution Java will 
			create and save in memory an object with all its instance variables initialized to their default values, for the Person object they are:
			-- name is initialized with null			
			-- age is initialized with 0
			-- enjoysReading is initialized with false
		*/
		p1 = new Person();
		// call/invoke a method on the object created above -- the method will display the object's instance variables
		p1.displayMe();

		
		// declare a variable of type Person
		Person p2;
		// create an object of type Person using the constructor with 3 parameters
		/* 
			in this case, during the program execution Java will 
			create and save in memory an object with its instance variables initialized as follows:
				-- name is initialized with "john"				
				-- age is initialized with 45
				-- enjoysReading is initialized with true
		*/
		p2 = new Person("john", 45, true);
		// call/invoke a method on the object created above -- the method will display the object's instance variables
		p2.displayMe();

		
		// declare a variable of type Person
		Person p3;
		// create an object of type Person using the constructor with 2 parameters
		/* 
			in this case, during the program execution Java will 
			create and save in memory an object with its instance variables initialized as follows:
			-- name is initialized with "emma"
			-- age is initialized with 0
			-- enjoysReading is initialized with true*/
		p3 = new Person("emma", true);
		// call/invoke a method on the object created above -- the method will display the object's instance variables
		p3.displayMe();
	  
  }
}



