/** 

Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
	
@author HDCOMP students and a e chis	
*/

// declare a class named Person
public class Person{
	
	// declare instance variables
	private String name; // to store the name
	private int age; // to store the age
	private boolean enjoysReading; // to store whether that Person enjoys reading or not
	
	// declare a getter method to be able to retrieve whether the Person enjoys reading or not
	public boolean getEnjoysReading(){
		return enjoysReading;
	}
	
	// declare a getter method to be able to retrieve the name
	public String getName(){
		return name;
	}
	
	
	// constructors: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	
	// declare multiple constructors -- in OOP, when we declare multiple constructors in the same class we *overload constructors*
	// the signature of the overloaded constructors must be different i.e. we cannot have 2 constructors with the same signature (please see the examples below)
		
	// declare a constructor with 3 parameters	
	public Person(String n, int a, boolean eR){
		// initialize the instance variables with the values provided by the user of this class (the user of this class is another class -- i.e. the class where we create the objects of type Person)
		
		// initialize the instance variable name with the value of the parameter n
		name = n;
		// initialize the instance variable age with the value of the parameter a
		age = a;
		// initialize the instance variable enjoysReading with the value of the parameter eR
		enjoysReading = eR;
	}
	
	/* 
	 declare the constructor without parameters
	 this constructor is known as the default constructor or the no-arguments constructor
	 if we do not declare ANY constructor in our class, the java compiler generates and inserts in the .class file the default constructor  (i.e. the constructor without parameters)
	 */
	public Person(){
		// the default constructor initializes all the instance variables  with their default values
		// in our example, the default values are null for name, 0 for age and false for enjoysReading
	}
	
	// declare a constructor with 2 parameters
	public Person(String name, boolean eR){
		// initialize the instance variable name (i.e. this.name) with the value of the parameter name
		this.name = name;
		// initialize the instance variable enjoysReading with the value of the parameter eR
		enjoysReading = eR;
	}
	
	// declare a constructor with 2 parameters	
	/* 
	note that this constructor does the same initializations as the above constructor (i.e. initializes the name and enjoysReading instance variables )
	therefore, either this or the above constructor is needed in this class but not both as they perform the same operations
	
	this constructor has a different signature namely, Person(boolean enjoysReading, String name) whereas the above is Person(String name, boolean eR) -- note the different order of the parameters data types
	
	when we declare multiple constructors in a class the constructors must have different signatures otherwise the compiler will generate a compilation error (i.e. constructor is already defined error)
	
	in general, when we overload constructors the signature must differ i.e. the parameters list must either have 
	different number of parameters, or if the parameter lists are of the same size, then across two constructors the parameters must have different data types and different order of the parameters data types 
	*/
	public Person(boolean enjoysReading, String name){
		// initialize the instance variable name (i.e. this.name) with the value of the parameter name
		this.name = name;
		// initialize the instance variable enjoysReading (i.e. this.enjoysReading) with the value of the parameter enjoysReading
		this.enjoysReading = enjoysReading;
	}
	
	
	// declare a display method -- this is added just to display the content of the instance variables immediately after an object creation using one of the available constructors
	public void displayMe() {
		displayName(); // we can call/invoke a method defined within this class
		System.out.println(age);
		System.out.println(enjoysReading);
		System.out.println();
	}
	
	public void displayName(){
		String n = getName(); // we can call/invoke a method defined within this class
		System.out.println(n);
	}
	

} // ends class


