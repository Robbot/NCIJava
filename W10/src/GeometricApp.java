/** Lab: Inheritance. Polymorphism. Abstract Classes.: Lab_Inheritance_Polymorphism_Abstract_Classes.pdf
Problem 2
Task2: Develop an application named GeometricApp to create the geometric shapes previously defined. The application should
create objects of each geometric type and display the properties (e.g. area, perimeter, volume) of each geometric shape.

Task3: Practice polymorphism and the instanceof keyword by declaring several variables of the 
superclass type and creating objects of the subclass type, and then calling specific methods on the objects. (follow the example shown in class – available also in the lecture slides)

e.g. AbstShape s1, s2;
s1 = new Triangle();
s2 = new Circle();

@author adriana e chis
*/

public class GeometricApp{
	public static void main(String args[]){
		// declare a variable of type AbstShape
		AbstShape aShape;			
		// AbstShape aShape = new AbstShape("a shape"); // is not allowed as abstract classes cannot be instantiated (i.e. we cannot create an object from an abstract class)
		

		// Task 2
		System.out.println("*****Problem 2: Task 2: Inheritance*****");
		
		// create the geometric shapes defined at Task 1
		Circle myCircle = new Circle("a circle", 3);
		Triangle myTriangle = new Triangle("a triangle", 3, 4, 5);
		Cube myCube = new Cube("a cube", 4);
		Sphere mySphere = new Sphere("a sphere", 4);
		
		// processing
		// remember that we compute the area for all the geometrical shapes, but the perimeter is computed for the 2D geometrical shapes and the volume is computed for the 3D geometrical shapes
		myCircle.computeArea();
		myCircle.computePerimeter();

		myTriangle.computeArea();
		myTriangle.computePerimeter();

		myCube.computeArea();
		myCube.computeVolume();

		mySphere.computeArea();
		mySphere.computeVolume();


		// output
		
		// we can call the getter methods getDescription(), getShapeName(), getArea() and getPerimeter() on the object myCircle because of the inheritance
		String desc = myCircle.getDescription();
		String name = myCircle.getShapeName();
		double value = myCircle.getArea();
		System.out.println(desc + ": " + name  + ": area: " + value);
		value = myCircle.getPerimeter();
		System.out.println(desc + ": " + name + ": perimeter: " + value);
		
		// we can call the getter methods getDescription(), getShapeName(), getArea() and getPerimeter() on the object myTriangle because of the inheritance
		// we can reuse the local variables declared above, as we have already displayed their content, therefore it is safe to replace their values
		desc = myTriangle.getDescription();
		name = myTriangle.getShapeName();
		value = myTriangle.getArea();
		System.out.println(desc + ": " + name + ": area: " + value);
		value =  myTriangle.getPerimeter();
		System.out.println(desc + ": " + name + ": perimeter: " + value);


		// we can call the getter methods getDescription(), getShapeName(), getArea() and getVolumne() on the object myCube because of the inheritance
		// we can reuse the local variables declared above, as we have already displayed their content, therefore it is safe to replace their values
		desc = myCube.getDescription();
		name = myCube.getShapeName();
		value = myCube.getArea();
		System.out.println(desc + ": " + name  + ": area: " + value);
		value = myCube.getVolume();
		System.out.println(desc + ": " + name  + ": volume: " + value);


		// we can call the getter methods getDescription(), getShapeName(), getArea() and getVolumne() on the object mySphere because of the inheritance
		// we can reuse the local variables declared above, as we have already displayed their content, therefore it is safe to replace their values
		desc = mySphere.getDescription();
		name = mySphere.getShapeName();
		value = mySphere.getArea();
		System.out.println(desc + ": " + name  + ": area: " + value);
		value = mySphere.getVolume();
		System.out.println(desc + ": " + name  + ": volume: " + value);


		// Task3: practice polymorphism and the instanceof keyword
		System.out.println();
		System.out.println();
		System.out.println("*****Problem 2: Task 3: Practice polymorphism and the instanceof keyword*****");
		System.out.println("*****Task3: polymorphism*****");
		// polymorphism
		// next we demonstrate the polymorphic nature of Java: computeArea() method shows the concept of polymorphism in Java. At runtime, even though all four objects, namely shape1, shape2, shape3 and shape4 are declared of the same type, i.e. the AbstShape superclass, at runtime Java calls the correct computeArea() method of the instance/object that is referred from each variable
		// declare variables of superclass type
		AbstShape shape1, shape2, shape3, shape4;		
		
		// create the objects
		shape1 = new Circle("another circle", 3);
		shape2 = new Triangle("another triangle", 3, 4, 5);
		shape3 = new Cube("another cube", 4);
		shape4 = new Sphere("another sphere", 2.5);

			
		// processing
		shape1.computeArea(); // Java calls here the method defined in the subclass Circle because Java sees that shape1 references an object of type Circle
		shape2.computeArea(); // Java calls here the method defined in the subclass Triangle because Java sees that shape2 references an object of type Triangle
		shape3.computeArea(); // Java calls here the method defined in the subclass Cube because Java sees that shape3 references an object of type Cube
		shape4.computeArea(); // Java calls here the method defined in the subclass Sphere because Java sees that shape4 references an object of type Sphere

		// output
		System.out.println(shape1.getDescription() + ": " + shape1.getShapeName()  + ": area: " + shape1.getArea());
		System.out.println(shape2.getDescription() + ": " + shape2.getShapeName()  + ": area: " + shape2.getArea());
		System.out.println(shape3.getDescription() + ": " + shape3.getShapeName()  + ": area: " + shape3.getArea());
		System.out.println(shape4.getDescription() + ": " + shape4.getShapeName()  + ": area: " + shape4.getArea());
		System.out.println();
	
		System.out.println();	 
		System.out.println("*****Task3: instanceof and downcasting*****");
		// the instanceof keyword allows to check at runtime (i.e. during program execution) if an objects is of a specified type (e.g. Circle, Triangle, Cube or Sphere in our case).
		// why is the instanceof keyword important? for example, AbstShape abstract superclass contains neither the computePerimeter() method nor the computeVolume() method. therefore, we cannot directly invoke the aforementioned methods on the shape1, shape2, shape3 or shape4

		// remove the next comment to see that we cannot directly call the getPerimeter() on the shape1 (because it has been declared as AbstShape), othwerwise we would get a compilation error. NOTE: recall to comment out the next line again, otherwise we get a compilation error
		// System.out.println(shape1.getDescription() + ": " + shape1.getShapeName()  + ": perimeter: " + shape1.getPerimeter());
		
		if (shape1 instanceof Circle){ 
			Circle c = (Circle) shape1; // downcast the shape1 from AbstShape to Circle. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computePerimeter() and getPerimeter()) which are declared only in the TwoDimensionalShape and its subclasses. If we try to directly call the method on the shape1 we would get a compilation error because the variable shape1 has been declared of type AbstShape above.
			c.computePerimeter();
			System.out.println(c.getDescription() + ": " + c.getShapeName()  + ": perimeter: " + c.getPerimeter());
		}

		System.out.println();
		if (shape2 instanceof Triangle){ 
			Triangle t= (Triangle) shape2; // downcast the shape2 from AbstShape to Triangle. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computePerimeter() and getPerimeter()) which are declared only in the TwoDimensionalShape and its subclasses. If we try to directly call the method on the shape2 we would get a compilation error because the variable shape2 has been declared of type AbstShape above.
			t.computePerimeter();
			System.out.println(t.getDescription() + ": " + t.getShapeName()  + ": perimeter: " + t.getPerimeter());
		}

		System.out.println();
		if (shape3 instanceof Cube){ 
			Cube c = (Cube) shape3; // downcast the shape3 from AbstShape to Cube. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computeVolume() and getVolume()) which are declared only in the ThreeDimensionalShape and its subclasses. If we try to directly call the method on the shape3 we would get a compilation error because the variable shape3 has been declared of type AbstShape above.
			c.computeVolume();
			System.out.println(c.getDescription() + ": " + c.getShapeName()  + ": volume: " + c.getVolume());
		}

		System.out.println();
		if (shape4 instanceof Sphere){ 
			Sphere s = (Sphere) shape4; // downcast the shape4 from AbstShape to Sphere. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computeVolume() and getVolume()) which are declared only in the ThreeDimensionalShape and its subclasses. If we try to directly call the method on the shape4 we would get a compilation error because the variable shape4 has been declared of type AbstShape above.
			s.computeVolume();
			System.out.println(s.getDescription() + ": " + s.getShapeName()  + ": volume: " + s.getVolume());
		}



		System.out.println();
		System.out.println();		
		System.out.println("*****Task3: Another example of using polymorphism and the instanceof keyword and downcasting -- an example where all the geometrical shapes are stored in an 1D array*****");
		System.out.println("*****Task3: polymorphism*****");
		// polymorphism
		// next we demonstrate the polymorphic nature of Java: computeArea() method shows the concept of polymorphism in Java. At runtime, even though all the objects of different geometrical shapes (which belong the the AbstShape class inheritance hierarchy) are stored in an 1D array of the superclass type, i.e. the AbstShape superclass, at runtime Java calls the correct computeArea() method of the instance/object that is referred from each element of the array
		// declare a 1D array of the superclass type  AbstShape (i.e. the array can store any objects from the inheritance class hierarchy of the AbstShape)
		AbstShape[] shapes;
		// let's create an array of size 4 because we'll store one object of each four geometrical shapes we defined (i.e. Circle, Triangle, Cube, Sphere)
		shapes = new AbstShape[4];		
		
		// create the objects and store them in the array
		shapes[0] = new Circle("yet another circle", 2);
		shapes[1] = new Triangle("yet another triangle", 5, 16, 20);
		shapes[2] = new Cube("yet another cube", 3);
		shapes[3] = new Sphere("yet another sphere", 4);

			
		// processing
		// traverse the array and compute the area for each geometric shape
		for (int i = 0; i < shapes.length; i++){

			AbstShape s = shapes[i]; // retrieve the current geometrical shape from the shapes array located at index i

			s.computeArea(); // due to polymorphism, Java will know to call the right computeArea() method defined in either the subclass Circle or Triangle or Cube or Sphere depending on the actual object type (i.e. either Circle or Triangle or Cube or Sphere) which is located in the array at the index i (for example, at index 0 is a Circle, at index 1 is a Triangle, at index 2 is a Cube, at index 3 is a Sphere -- just because this is the order we stored these objectes in the array in the lines of code 166-169 above)
		}

		System.out.println();

		// output
		// traverse the array and display the area for each geometric shape
		for (int i = 0; i < shapes.length; i++){
			AbstShape s = shapes[i]; // retrieve the current geometrical shape from the shapes array located at index i
			System.out.println(s.getDescription() + ": " + s.getShapeName()  + ": area: " + s.getArea());
		}
		
	
		System.out.println();	 
		System.out.println("*****Task3: instanceof and downcasting*****");
		// the instanceof keyword allows to check at runtime (i.e. during program execution) if an objects is of a specified type (e.g. Circle, Triangle, Cube or Sphere in our case).
		// why is the instanceof keyword important? for example, AbstShape abstract superclass contains neither the computePerimeter() method nor the computeVolume() method. therefore, we cannot directly invoke the aforementioned methods on object stored in the shapes array of AbstShape type

		// remove the next comment to see that we cannot directly call the getPerimeter() on the first element of the array (because it has been declared as AbstShape), othwerwise we would get a compilation error. NOTE: recall to comment out the next line again, otherwise we get a compilation error
		// System.out.println(shapes[0].getDescription() + ": " + shapes[0].getShapeName()  + ": perimeter: " + shapes[0].getPerimeter());
		

		// processing and output
		// traverse the array: in each iteration compute and display either the perimeter for the 2D geometric shapes or the volume for the 3D geometric shapes
		for (int i = 0; i < shapes.length; i++){
			AbstShape s = shapes[i]; // retrieve the current geometrical shape from the shapes array located at index i

			// determine the type of the object located at index i, so that we know whether we compute the perimeter or the volume for that object			
			if (s instanceof Circle){ 
				Circle c = (Circle) s; // downcast the s from AbstShape to Circle. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computePerimeter() and getPerimeter()) which are declared only in the TwoDShape and its subclasses. If we try to directly call the method on the s we would get a compilation error because the variable s has been declared of type AbstShape above.
				
				// processing
				c.computePerimeter();
				// output
				// the getter methods are available on the object of type Circle because of the inheritance
				System.out.println(c.getDescription() + ": " + c.getShapeName()  + ": perimeter: " + c.getPerimeter());
			
			} else if (s instanceof Triangle){ 
				Triangle t= (Triangle) s; // downcast the s from AbstShape to Triangle. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computePerimeter() and getPerimeter()) which are declared only in the TwoDShape and its subclasses. If we try to directly call the method on the s we would get a compilation error because the variable s has been declared of type AbstShape above.
				
				// processing
				t.computePerimeter();
				// output
				// the getter methods are available on the object of type Triangle because of the inheritance
				System.out.println(t.getDescription() + ": " + t.getShapeName()  + ": perimeter: " + t.getPerimeter());

			} else if (s instanceof Cube){ 
				Cube c = (Cube) s; // downcast the s from AbstShape to Cube. Q1: Why do we need to downcast? A1: Because we want to use specific methods (e.g. computeVolume() and getVolume()) which are declared only in the ThreeDShape and its subclasses. If we try to directly call the method on the s we would get a compilation error because the variable s has been declared of type AbstShape above.
				
				// processing
				c.computeVolume();
				// output
				// the getter methods are available on the object of type Cube because of the inheritance`
				System.out.println(c.getDescription() + ": " + c.getShapeName()  + ": volume: " + c.getVolume());

			} else if (s instanceof Sphere){ 
				Sphere aSphere = (Sphere) s; // downcast the s from AbstShape to Sphere. Q1: Why do we need to d`wncast? A1: Because we want to use specific methods (e.g. computeVolume() and getVolume()) which are declared only in the ThreeDShape and its subclasses. If we try to directly call the method on the s we would get a compilation error because the variable s has been declared of type AbstShape above.
				
				// processing
				aSphere.computeVolume();
				// output
				// the getter methods are available on the object of type Sphere because of the inheritance
				System.out.println(aSphere.getDescription() + ": " + aSphere.getShapeName()  + ": volume: " + aSphere.getVolume());
			}
			System.out.println();	 
	
		}	
			
	}
}
