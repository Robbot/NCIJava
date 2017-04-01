import java.util.Scanner;
public class InteractiveCarpet {
	public static void main(String args[]){
	// create a object sc Scanner
	Scanner sc;
	sc = new Scanner(System.in);
	// declare variables
		int length; int width; int carpetCost; int carpetPrice;
		
	System.out.println("Please enter length of carpet: ");
	length = sc.nextInt();
	System.out.println("Please enter width of carpet: ");
	width = sc.nextInt();
	//carpet price 30 euros per square meter
	carpetPrice = 30;
	carpetCost = length * width * carpetPrice;
	//Displays area of carpet and the price
	System.out.println(carpetCost);
	
	}
}
