/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// in Java, we use packages to group related types (i.e. classes) and to control access
// package geometry;

/**
 *
 * @author HSCOMP students & a e c
 */

 // Task 7 from Lab_Inheritance_Polymorphism_Abstract_Classes.pdf document
public abstract class TwoDShape extends AbsShape{
    
    public TwoDShape(String sName){
        super(sName);
    }
  
    /*    
    we either implement the method computeArea() which was defined as abstract in the superclass AbsShape, or we declare this class (i.e. TwoDShape) as abstract too
    @Override
    public void computeArea(){
        area = 0;
    }
    */
    
}
