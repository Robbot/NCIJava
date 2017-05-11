package w02;
import java.util.Scanner;
public class CircleArea {
	public static void main(String args[]){
	// create a object sc Scanner
	Scanner sc;
	sc = new Scanner(System.in);
	// declare variables
		double radius; double result;
		
	System.out.println("Please enter radius of circle: ");
	radius = sc.nextDouble();
	
	result = 3.14 * radius * radius;
	//Displays area of carpet and the price
	System.out.println(result);
	
	}
}
