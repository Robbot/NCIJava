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

ThreeDimensionalShape
	-- ThreeDimensionalShape is called an abstract class, or more specifically an abstract superclass. 
	-- ThreeDimensionalShape is also a subclass because it inherits from AbstShape superclass.

@author adriana e chis
*/

// declare an abstract class by using the keyword abstract
// this is still an abstract class because the ThreeDimensionalShape class generically describe all the 3D geometrical shapes, the class still cannot compute the specifics of each 3D class of geometrical figures (e.g. the volume of a cube, or the surface area of a sphere)
public abstract class ThreeDimensionalShape extends AbstShape {

	// in general a superclass should indentify and declare all the data members and methods that are common to the immediate class hierarchy

	// declare data members / instance variables
	protected double volume;

	// declare constructors
	public ThreeDimensionalShape(String shapeName){ 
		super(shapeName);  // call the constructor of the superclass, more specifically call the constructor with one parameter
		description = "three dimensional shape"; // the instance variable description is available in this subclass due to inheritance
	}

	// declare getter methods
	public double getVolume(){
		return volume;
	}


	// declare abstract methods and processing methods
	// the following method is an abstract method i.e. there is no method body
	// the method declaration finishes with a ; immediately after the method header
	// declaring a method as abstract *enforces all* the subclasses that inherits from the ThreeDShape to provide an implementation for the abstract method (i.e. they have to implement the method to provide its body). if the subclass does not implement an abstract method, then the subclass must be declared itself as an abstract class.
	public abstract void computeVolume();


}



