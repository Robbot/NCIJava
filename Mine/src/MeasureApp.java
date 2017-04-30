import java.util.*;
public class MeasureApp {
	public static void main(String[] args){
		//declare variables
		int m, cm;
		
		//declare objects
		Scanner sc;
		Measure myMeasure;
		
		//create objects
		sc = new Scanner(System.in);
		myMeasure = new Measure();
		
		//input
		System.out.println("Please enter number of meters");
		m = sc.nextInt();
		myMeasure.setM(m);
		
		//process
		myMeasure.compute();
		
		//output
		cm = myMeasure.getCm();
		System.out.println("The total number of centimeters is "+cm);
	}
}
