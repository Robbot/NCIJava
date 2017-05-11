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

Triangle
	-- Triangle is a subclass, TwoDimensionalShape is its direct superclass and AbstShape is its indirect superclass

@author adriana e chis
*/

// declare a class named Triangle which inherits from the TwoDimensionalShape. Triangle is a subclass, TwoDimensionalShape is its direct superclass and AbstShape is its indirect superclass.
public class Triangle extends TwoDimensionalShape {
	// declare data members / instance variables
	// the length of the three sides of a triangle
	private double side1;

	private double side2;

	private double side3;
	
	public Triangle(String shapeName, double s1, double s2, double s3){
		super(shapeName); // call the constructor of the superclass, more specifically call the constructor with one parameter
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass
	@Override
	public void computePerimeter(){
		perimeter = side1 + side2 + side3;
	}

	
	// a subclass which is not abstract and inherits from an abstract class must provide implementations for all the abstract methods belonging to the superclass
	@Override
	public void computeArea(){
		// use Heron's formula to compute the area of a triangle: https://en.wikipedia.org/wiki/Heron%27s_formula#Formulation
		// Heron's formula requires the perimeter of the triangle, therefore we can invoke/call the computePerimeter() method defined in this class to compute the perimeter
		computePerimeter(); // when this method finishes its execution the instance variable named perimeter (available here due to the inheritance) contains the value of the perimeter for a triangle with the above sides
		/*
		// alternatively, if you do not call the above computePerimeter() method you would have to include here the calculation of the perimeter
        perimeter = side1 + side2 + side3;
        */
		double halfPerimeter = perimeter / 2;

		// the Math.sqrt() method returns the square root of a double value: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#sqrt%28double%29
		area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
	}
	
		
}
