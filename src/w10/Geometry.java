/*package w10;
// in Java, we use packages to group related types (i.e. classes) and to control access
// package geometry;

*//**
 * Inheritance example: Write an application that calculates the area and perimeter of a rectangle and a square and displays them to the user. Use inheritance and polymorphism.
 * 
 * Geometry uses the instantiable classes Rectangle (a subclass) and the Shape (a superclass) to demonstrate the concepts of inheritance and polymorphism in Java.
 * 
 * @author HDCOMP students & a e chis
 *//*
public class Geometry {

    *//**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        
        
         demo inheritance
        System.out.println("===inheritance demo");
        // declare a variable named s1 of type Shape (i.e. the superclass)
        Shape s1;
        // create an object of type Shape
        s1 = new Shape("a shape");
        // processing
        s1.computeArea();
        double a = s1.getArea();
        // output
        System.out.println("shape: " + a);

        // declare a variable named r of type Rectangle (i.e. the subclass)
        Rectangle r1;
        // create an object of type Rectangle
        r1 = new Rectangle("a rectangle", 6, 4);
        // processing
        r1.computeArea();
        // output
        // next, we can call the getter method getArea() on the object r1 because the subclass Rectangle inherits the getArea() method from the superclass Shape 
        // (recall that when we declared the class Rectangle we used the keyword extends to inherit from the Shape class)
        a = r1.getArea();
        System.out.println("rectangle: " + a);
        
         polymorphism demo 
        // Task 1 from Lab_Inheritance_Polymorphism_Abstract_Classes.pdf document
        System.out.println("===polymorphism demo");
        // declare two variable of superclass type Shape
        Shape shape1, rectangle1;
        // create an object of type Shape
        shape1 = new Shape("another shape");
        // create an object of type Rectangle
        rectangle1 = new Rectangle("another rectangle", 7, 3);
        
        // processing
	// next we demonstrate the polymorphic nature of Java: the computeArea() method shows the concept of polymorphism in Java. Even though both variables, namely shape1 and  rectangle1 are declared of the same type, i.e. the Shape superclass, at runtime Java calls the correct method of the instance/object that is referred from each variable
        shape1.computeArea(); // calls the computeArea() defined in the Shape class
        rectangle1.computeArea(); // calls the computeArea() defined in the Rectangle class
        
        // output
        a = shape1.getArea();
        System.out.println("shape: " + a);
        a = rectangle1.getArea();
        System.out.println("rectangle: " + a);   
        
         instanceof demo 
        System.out.println("===instanceof demo");
        // declare two variable of superclass type Shape
        Shape s2, r2;
        // create an object of type Shape
        s2 = new Shape("yet another shape");
        // create an object of type Rectangle
        r2 = new Rectangle("yet another rectangle", 4, 2);
        
        
        // Task 6 from Lab_Inheritance_Polymorphism_Abstract_Classes.pdf document
        // we would like to print the width of s2 and r2, if the geometrical shapes they do represent indeed have a width
        double w;
        if (r2 instanceof Rectangle){ // yes, it is (recall that on line 70 we saved in r2 an object of type Rectangle)
            // downcast r2 from type Shape to type Rectangle. We need to downcast because the method getWidth() is only available on the objects of type Rectangle – the method is only declared within the Rectangle subclass and not within the Shape superclass
            Rectangle r = (Rectangle) r2; // downcast
            w = r.getWidth();
            System.out.println(w);
        }
        
        if ( s2 instanceof Rectangle){ // no, it is not (recall that on line 68 we saved in s2 an object of type Shape), therefore the body of the if is not executed, and the runtime exception is prevented (i.e. because the downcast from line 82 is not run)
            Rectangle s3 = (Rectangle)s2;
            w = s3.getWidth();
            System.out.println(w);
        }
        
         abstract class demo 
        // AbsShape abs = new AbsShape("generic shape"); // this line is commented out as we cannot create object/instances of an abstract class
        
        TODO remove the comment of the line 88, compile this class and you should see a compilation error: "AbsShape is abstract; cannot be instantiated". The compiler tells us that we cannot create objects of type AbsShape -- recall that we declared the class as abstract
        
        
        
         overriding methods demo 
        System.out.println("===overriding methods demo");
        // next we use/call/invoke the methods from the superclass Shape and subclass Rectangle
        // the Rectangle class overrides the methods from the superclass Shape (solutions to Task 2, Task 3, Task 4 and Task 5 from Lab_Inheritance_Polymorphism_Abstract_Classes.pdf document)
        s1.printDescription();
        r1.printDescription();

        s1.displayMe();
        r1.displayMe();
        
        
        *//************************************************************//*
        
         another demo on polymorphism and instanceof keyword; the above examples on polymorphism and instanceof are rewritten using an 1D array of Shapes
        System.out.println("===another polymorphism and instanceof demo using an array of type Shape shapes[]");
        // polymorphism allows us to write programs that process both objects of different subclasses and objects of the superclass as if they were all objects of the superclass; let's assume we would have a large array of a superclass type, then the array can store objects of any types which belong to the same inheritance hierarchy
        Shape[] shapes = new Shape[4]; // declare and create an array of type Shape with size 4
        shapes[0] = shape1; // store the object of type Shape as the first element in the array
        shapes[1] = rectangle1; // store the object of type Rectangle as the second element in the array
        shapes[2] = s2; // store the object of type Shape as the third element in the array
        shapes[3] = r2; // store the object of type Rectangle as the fourth element in the array
        
        double area, width; // declare a variable of type double named area
        Shape s; // declare a variable named s of type Shape
        for (int i = 0; i < shapes.length; i++){
                s = shapes[i]; // retrieve the current object from the array
                // polymorphism demo
                
                polymorphism: at runtime Java calls the correct computeArea() method of the instance/object that is referred from each variable, 
                that means if the object's type is Shape it will call the computeArea() method defined in the Shape class, 
                whereas if the object's type is Rectangle it will call the computeArea() method defined in the Rectangle
                
                s.computeArea(); 
                area = s.getArea();
                System.out.println("area is: " + area);

                // instanceof demo 
                // display the width of the current geometrical shape, if the current geometrical shape has a width (i.e. a generical geometrical shape of type Shape does not have a width)
                // check if the current object is an instance/object of type Rectangle
                if (s instanceof Rectangle){
                    //  we need to downcast because the method getWidth() is only available on the objects of type Rectangle – the method is only declared within the Rectangle subclass and not within the Shape superclass
                    Rectangle rr = (Rectangle) s;
                    width = rr.getWidth();
                    System.out.println("object stored at index " + i  + " in array is-a Rectangle, has the width " + width);

                } // ends if				

        } // ends for
    }   
}


*/