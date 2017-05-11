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

Circle
	-- Circle is a subclass, TwoDimensionalShape is its direct superclass and AbstShape is its indirect superclass

@author adriana e chis
*/

// declare a class named Circle which inherits from the TwoDimensionalShape. Circle is a subclass, TwoDimensionalShape is its direct superclass and AbstShape is its indirect superclass.
public class Circle extends TwoDimensionalShape {
	// declare data members / instance variables
	// the radius of a circle
	private double radius;

	private final double PI = 3.1416;

	public Circle(String shapeName, double radius){
		super(shapeName); // call the constructor of the superclass, more specifically call the constructor with one parameter
		this.radius = radius;
	}
	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass	
	@Override
	public void computeArea(){
		area = PI * radius * radius;
	}
	

	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass
	@Override
	public void computePerimeter(){
		perimeter = 2 * PI * radius;
	}	
}



