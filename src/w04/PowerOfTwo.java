/**
@author HDCOMP students & a e chis

a simple example to demonstrate 
    -- how to declare an instantiable class
    -- how to implement a class's attributes/properties/state by declaring instance variables
	-- how to implement a class's behaviour by implementing methods
	-- how to declare a constructor
    		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
    -- how to declare a setter method
            --- A setter method is a method which sets/mutates the value of an instance variable.
    -- how to declare a getter method
            --- A getter method is a method which returns/ retrieves the value of an instance variable.
*/

public class PowerOfTwo{
	// declare instance variables 
	private int n; // to store a number
	private int result; // to store n to the power 2 (i.e. the square of n)
	
	// declare a constructor with 1 parameter
	public PowerOfTwo(int n){
	    // initialize the instance variable n (this.n) with the value of the parameter n
		this.n = n;
		// note that result is going to be initialized with 0
	}
	
	// declare a setter method which allows to store a value into the instance variable named n
	public void setN(int number){
		// store in the instance variable n (this.n) the value of the parameter number
		this.n = number;
	}
	
	// declare a method to calculate n to the power 2	
	public void power(){
	    // calculate n to the power 2 and saves the result in the instance variable named result
		result = n*n;
	}
	
	// declare a getter method to return the value of the instance variable result 
	public int getResult(){
		return result;
	}
		
}



