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
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee e = new Employee();
        e.setDob("12/04/1985");
        e.setId("1");
        e.setName("Joe");
        
        System.out.println(e.printDetails());
        
        Employee e2 = new Employee("2","Bob","11/11/1990");
        System.out.println("Employee Details: "+e2.getId()+", "+e2.getName()+ ", " + e2.getDob());
        
        //manager
        Manager m = new Manager();
        m.setId("m1");
        m.setName("John");
        m.setDob("01/02/1983");
        m.setSalary(23000);
        
        System.out.println(m.printDetails());
        
        Manager m2 = new Manager(25000, "m2", "Mary", "21/05/1980");
        System.out.println("Manager Details: "+m2.getId()+", "+m2.getDob()+", "
                +m2.getName()+", "+m2.getSalary());
        
        FloorStaff f = new FloorStaff(15, "f1", "Jane", "20/11/2000");
        
        System.out.println("Floor Staff: "+f.getId()+", "+f.getDob()+", "+f.getName()+ 
                ", "+f.getRate());
        
    }
    
}
