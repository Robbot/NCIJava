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

Cube
	-- Cube is a subclass, ThreeDimensionalShape is its direct superclass and AbstShape is its indirect superclass

@author adriana e chis
*/

// declare a class named Cube which inherits from the ThreeDimensionalShape. Cube is a subclass, ThreeDimensionalShape is its direct superclass and AbstShape is its indirect superclass
public class Cube extends ThreeDimensionalShape {
	// declare data members / instance variables

	// the edge length of a cube
	private double edge;
	
	// declare constructor(s)
	public Cube(String shapeName, double edge){
		super(shapeName); // call the constructor of the superclass, more specifically call the constructor with one parameter
		this.edge = edge;
	}
	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass	
	@Override
	public void computeArea(){
		area = 6 * edge * edge;
	}
	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass
	@Override
	public void computeVolume(){
		volume = edge * edge * edge;
	}	
}



