package mine;
import java.util.*;
public class MeasureApp {
	public static void main(String[] args){
		//declare variables
		int am, cm;
		
		//declare objects
		Scanner sc;
		Measure myMeasure;
		
		//create objects
		sc = new Scanner(System.in);
		myMeasure = new Measure();
		
		//input
		System.out.println("Please enter number of meters");
		//am = sc.nextInt();
		myMeasure.setM(5);
		
		//process
		myMeasure.compute();
		
		//output
		cm = myMeasure.getCm();
		System.out.println("The total number of centimeters is "+cm);
	}
}
