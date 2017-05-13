package w06;
import java.util.Scanner;
public class TheatreApp{
	public static void main(String args[]){
		//declare vars
		String day;
		int cost;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Theatre t;
		t=new Theatre();
		//inputs
		System.out.println("What day?");
		day=scan.next();
		//set
		t.setDay(day);
		//compute
		t.compute();
		//get
		cost=t.getCost();
		//output
		System.out.println("Cost is: "+cost);
	}
}
