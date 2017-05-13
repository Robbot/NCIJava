package mine;
import java.util.Scanner;
public class GasPrices {
	public static void main(String[] args){
		int pricePerBarrel;
		double priceMin;
		double priceMax;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Insert current price of barrell ");
		pricePerBarrel = sc.nextInt();
		priceMin = pricePerBarrel / 28.57;
		priceMax = pricePerBarrel / 25.0;
		System.out.println("Price of barrel is "+pricePerBarrel+" so the cost at pump station should be between "+priceMin+" and "+priceMax);
		
		
	}
}
