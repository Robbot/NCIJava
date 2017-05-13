package mine;
import java.util.Scanner; 
public class Radius 
{ 
	public static void main (String args []) 
		{ 
		double radius, Area; 
		final double PI = 3.14; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter radius: "); 
		radius = input.nextDouble(); Area = PI * PI * radius; 
		System.out.println("Area of a circle is " + Area); 
		} 
	}