package w05;
/**

Problem 3 of Selection Statements Lab

@author HDCOMP students & a e chis


*/

public class Blood {
	// declare instance variables

	private int age; // to store the age
	private String type; // to store blood type
	private String message; // to store the message for donor -- to be computed
	
    // declare constants for blood types	
	private final String A = "A";
	private final String B = "B";
	private final String AB = "AB";
	private final String O = "0";
	
	
	// declare a setter method to store a value into the instance variable named age
	public void setAge(int age){
	    // store in the instance variable age (this.age) the value of the parameter age
		this.age = age;
	}
	
	// declare a setter method to store a value into the instance variable named type
	public void setType(String t){
	    // store in the instance variable type the value of the parameter t
		type = t;
	}
	
	// declare a getter method to return the value of the instance variable message
	public String getMessage(){
		return message;
	}
	
	// declare a method to build the message for the blood donor
	public void computeDonorInfo(){
	
	    // use 2 nested selection statements, an if else selection statement to determine whether the person can be a donor
	    // if the person can be a donor then use a switch multiple selection statements to build a customized message for the blood groups the user can give to, and the blood groups the user can receive from
	    
		if (age < 18) { // the user cannot be a donor
			message = "You cannot donate";
		} else { // otherwise, the user can be a donor
		
		    // compute the blood groups the user can give to, and the blood groups the user can receive from
		    
		    // the program should work irrespective of the way the blood type is written by the user (e.g. lower case, upper case or a combination of the two)
		    // therefore we must convert all the letters to upper case because we used upper case when we defined above all the values for the constants
		    // we can store the lower case version in the instance variable type because we do not need the previous content (i.e. the value) of that variable
		    type = type.toUpperCase();
		    
		    // use a switch multiple selection statements
			switch (type) { //based on the value of the type instance variable we are building a different message
				case AB: 
					message = "Can give to: AB; Can receive from: AB, A, B, 0";
					break;
					
				case A:
					message = "Can give to: A and AB; Can receive from: A and 0";
					break;
					
				case B:
					message = "Can give to: B and AB; Can receive from: B and 0";
					break;
					
				case O:
					message = "Can give to: A, B, AB and O; Can receive from: 0";
					break;
					
				default: // when the blood type provided does not match any of the existing categories build a message to inform the user
					message = "Invalid blood type";
					break;					
			} // ends switch
				
		} // ends if else
		
	} // ends method
	
	
} // ends class


