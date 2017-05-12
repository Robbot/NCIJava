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

package w04;
public class PowerOfTwoApp{
    public static void main(String args[]){

		// declare a variable of type PowerOfTwo
		PowerOfTwo banana;

		
		// declare a variable and initialize it to 5; note: usually we would ask the user to provide us the number, it is not a good practice to hardcode values in your program -- we were using here a hardcoded value here as the focus wasn't to demonstrate how to get input from the user
		int mynumber = 5;

   		// create an object of type PowerOfTwo using the constructor with 1 parameter
   		/* create and save in memory an object with its instance variables initialized as follows:
				-- n is initialized with 5				
				-- result is initialized with 0
   		*/
		banana = new PowerOfTwo(mynumber);
		// processing
		// call the method power() on the object banana	
		banana.power();

        // call the getter method getResult() on the object banana to retrieve the result, and store the result in variable res
		int res =  banana.getResult();
		// ouput
		System.out.println(res);

       	// input
		mynumber = 13;	// note: usually we would ask the user to provide us the number, it is not a good practice to hardcode values in your program
		// use the setter method called setN() to set/assign the value 13 to the instance variable named N
		// please note that we are reusing the same object to perform another computation
		banana.setN(mynumber);
		// processing
		banana.power();
		// call the getter method getResult() to retrieve the result, and store the result in variable res
		res = banana.getResult();
		// output
		System.out.println(res);
	}
}



