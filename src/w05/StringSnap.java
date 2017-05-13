/** StringSnap.java -- checks whether 2 Strings are the same, and then
prints "SNAP" if they are the same. 

@author HDCOMP students & a e chis

Intructions: Once we finish writing a program we must test it to make sure that the program works exactly as described in the problem's text.
Compile and run the program with the next inputs:
Test 1:
	enter first word:
	john
	enter second word:
	john

	the result should be:
	SNAP
	SNAP 2
	

Test2:
	enter first word:
	john
	enter second word:
	mark

	no message should be displayed

Test 3:
	enter first word:
	john
	enter second word:
	JOHN

	the result should be:
	SNAP2

	Q: why does the program display only the message "SNAP2" for Test3?
	A: recall that Java is case sensitive. The method equals() returns true only if the two words (i.e. texts) are written using the same format i.e. letter case, therefore SNAP is not displayed because the first call of equals() method is applied on the text1 and text2 written as provided by the user. The method equalsIgnoreCase() returns true if the two words contain the same text without taking into consideration how the text is written (i.e. upper case, lower case or a combination of upper and lower case), therefore the text SNAP2 is displayed.
	
*/
package w05;
import java.util.Scanner;

// declare a class named StringSnap 
public class StringSnap {
    
    
	public static void main(String args[]){
		
		// input
		// declare variables
		String text1, text2;
		
		// declare a variable of type Scanner, and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		
		// prompt the user for input
		// prompt the user to provide the first word
		System.out.println("enter word:");
		text1 = input.next(); // reads one word 
		/* next() method returns one token (i.e. by default one word)
		 if we want to read an entire line from the keyboard we can use the nextLine() method which returns the String corresponding to that line. For example,
		text1 = input.nextLine();
		*/
		
		// prompt the user to provide the second word
		System.out.println("enter word:");
		text2 = input.next(); // reads one word -- next() method returns one token (i.e. by default one word)
		
		// processing
		// we compare Strings, and objects in general, with the method equals() (note: all the objects have the method equals() available)

		// we cannot compare objects (e.g. Strings) with the equality operator ==
		// recall that Java is case sensitive, the method equals() on Strings returns true only if the two words are written using the same format (e.g. 1) if text1="joHN" and text2=joHN" equals() method returns true, 2) if text1="joHN" and text2=JOhn" equals() method returns false) 
		if (text1.equals(text2)){
	    	// output
			System.out.println("SNAP");
		}
		
		// we cannot compare objects (e.g. Strings) with the equality operator ==
		// below we use the method called equalsIgnoreCase() -- the method compares two pieces of text (i.e. two objects of type String) and returns true if the two contain the same text without taking into consideration how the text is written (i.e. upper case, lower case or a combination of upper and lower case) (e.g. 1) text1="joHN" and text2=joHN" equalsIgnoreCase() method returns true, 2) if text1="joHN" and text2=JOhn" equalsIgnoreCase() method returns true) 
		if (text1.equalsIgnoreCase(text2)){
		    // output
			System.out.println("SNAP 2");
		} 		
		
	} // ends main method
	
} // ends class



