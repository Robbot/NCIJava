package w10;
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

Sphere
	-- Sphere is a subclass, ThreeDimensionalShape is its direct superclass and AbstShape is its indirect superclass

@author adriana e chis
*/

// declare a class named Sphere which inherits from the ThreeDimensionalShape. Sphere is a subclass, ThreeDimensionalShape is its direct superclass and AbstShape is its indirect superclass
public class Sphere extends ThreeDimensionalShape {
	// declare data members / instance variables

	// the radius of a sphere
	private double radius;

	private final double PI = 3.1416;
	
	// declare constructor(s)
	public Sphere(String shapeName, double r){
		super(shapeName); // call the constructor of the superclass, more specifically call the constructor with one parameter
		radius = r;
	}
	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass	
	@Override
	public void computeArea(){
		// the surface area of a sphere is given by the following formula
		area = 4 * PI * radius * radius;
	}
	

	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass
	@Override
	public void computeVolume(){
		// the volume of a sphere is given by the following formula
		volume = 4/3 * (PI * radius * radius * radius);
	}	
}
