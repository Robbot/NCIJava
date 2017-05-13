/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author Glen Ward
 */
public class Employee {
    
    protected String id;
    protected String name;
    protected String dob;
    
    //constructor
    public Employee(){
        id = "";
        name = "";
        dob = "";
    }
    
    //overloaded constructor
    public Employee(String id, String name, String dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    
    //setters
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    
    //getters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    
    //print method
    public String printDetails(){
        return "Employee Details: "+id+", "+", "+name+", "+dob;
    }
    
}
