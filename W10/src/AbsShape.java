 // in Java, we use packages to group related types (i.e. classes) and to control access
// package geometry;

/**
 * Inheritance example: Write an application that calculates the area and perimeter of a rectangle and a square and displays them to the user. Use inheritance and polymorphism.
 * 
 * AbsShape is a class that represents generic geometric shapes
 * 
 * @author HDCOMP students & a e chis
 * 
 * A generic geometric shape, the formula for the area is not known in this class as this class generically represents all the geometric shapes, therefore the method computeArea() is declared as abstract (i.e. there is no body for this method), and consequently the class becomes an abstract class
 */

 // Task 7 from Lab_Inheritance_Polymorphism_Abstract_Classes.pdf document
public abstract class AbsShape {
    
    // declare instance variables
    private String shapeName;
    protected double area;
    
   // declare a constructor with one parameter
    public AbsShape(String shapeName){
        this.shapeName = shapeName;        
    }
    
   
    // the formula for the area is not known in this class as this class generically represents all the geometric shapes, therefore the method is declared as abstract.	
    public abstract void computeArea();       
    
    
    // declare a getter method to retrieve the value of the area
    public double getArea(){
        return area;
    }

    
}