package w06;
import java.util.Scanner;
public class BloodApp{
	public static void main(String args[]){
		//declare vars
		int age;
		String bloodType,message;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Blood bl;
		bl=new Blood();
		//input
		System.out.println("What age are you?");
		age=scan.nextInt();
		System.out.println("What bloodtype are you?");
		bloodType=scan.next();
		//set
		bl.setAge(age);
		bl.setBloodType(bloodType);
		//compute
		bl.compute();
		//get
		message=bl.getMessage();
		//output
		System.out.println(message);
	}
}
