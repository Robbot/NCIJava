/** Lab: Inheritance. Polymorphism. Abstract Classes.: Lab_Inheritance_Polymorphism_Abstract_Classes.pdf
Problem 2
Task1: Extend the example shown during class, to create an
inheritance hierarchy for geometrical shapes as depicted on
the next slide. There is a superclass named AbsShape, the
superclass of all geometrical shapes. There are two other
classes that generically represent all the 2D and 3D
geometrical shapes respectively. For the 2D geometrical
shapes implement the classes Circle and Triangle. For the 3D
geometrical shapes implement the classes Cube and Sphere.

The 2D geometrical shapes contain methods to compute their
area and perimeter. The 3D geometrical shapes contain
methods to compute their surface area and volume.

Use inheritance and abstract classes.

AbstShape
	-- AbstShape is called an abstract class, or more specifically is an abstract superclass.

Note: we call this class AbstShape and not AbsShape or Shape, to avoid overwriting the class AbsShape or Shape we developed together during class.

@author adriana e chis
*/

// declare an abstract class by using the keyword abstract
// Note: recall from the example shown in class that we cannot create objects of an abstract class (i.e. an abstract class is not instantiable)
public abstract class AbstShape {
	// in general a superclass should indentify and declare all the data members and methods that are common to the immediate class hierarchy

	// declare data members / instance variables
	private String shapeName;

	protected String description;

	protected double area;
	
	// declare constructors
	public AbstShape(String shapeName){
		this.shapeName = shapeName;
	}
	
	// declare setter methods
	public void setShapeName(String shapeName){
		this.shapeName = shapeName;
	}
	
	// declare getter methods
	public String getShapeName(){
		return shapeName;
	}

	public String getDescription() { 
		return description;
	}

	public double getArea(){
		return area;
	}
	
	// declare abstract methods and processing methods
	// declare processing/compute methods;
	// the following method is an abstract method that means there is no method body
	// the method declaration finishes with a ; immediately after the method header
	// declaring a method as abstract *enforces all* the subclasses that inherits from the AbsShape to provide an implementation for the abstract method (i.e. they have to implement the method to provide its body). if the subclass does not implement an abstract method, then the subclass must be declared itself as an abstract class.
	public abstract void computeArea();



	
}




