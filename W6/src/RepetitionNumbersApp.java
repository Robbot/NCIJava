/**
Practice work: Problem 7
Write a program to perform the following tasks:
-- Display numbers from 0 to 15 inclusive
-- Display numbers from 15 to 0 inclusive
-- Display numbers 10, 20, 30, 40, 50
-- Display numbers 100, 80, 60, 40, 20, 0

@author a e chis


*/



public class RepetitionNumbersApp{
	public static void main(String args[]){
	
	    // these tasks can be implemented using any of the while, do while or for loops
	   
	    // Display numbers from 0 to 15 inclusive
	    System.out.println("Display numbers from 0 to 15 inclusive");
        for (int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }
        System.out.println(); 
        System.out.println();
        
 
   	    // Display numbers from 15 to 0 inclusive
	    System.out.println("Display numbers from 15 to 0 inclusive");
        for (int i = 15; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
 
        // Display numbers 10, 20, 30, 40, 50
	    System.out.println("Display numbers 10, 20, 30, 40, 50");
        for (int i = 10; i <= 50; i+=10){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();        

 
        // Display numbers 100, 80, 60, 40, 20, 0
	    System.out.println("Display numbers 100, 80, 60, 40, 20, 0");
        for (int i = 100; i >= 0; i = i - 20){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
                
    }
}
