import java.util.Scanner;
public class changeCalculator {
	public static void main(String args[]){
	// create a object sc Scanner
	Scanner sc;
	sc = new Scanner(System.in);
	// declare variables
		double costOfProducts; double amount; int result; int cost;
		
	System.out.println("Please enter total cost of products: ");
	costOfProducts = sc.nextDouble();
	System.out.println("Please enter amount given by customer: ");
	amount = sc.nextDouble();
	
	cost = (int) costOfProducts;
		
	
	System.out.println(cost);
		
	}
}
