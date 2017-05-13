package mine;
import java.util.*;

public class Diamond {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("How many oranges would you like to buy?");
		int quantity = sc.nextInt();
		int dozen = quantity / 12;
		Double last = quantity % 12.0;
		Double total = dozen * 4.50 + last * 0.45;
		System.out.println("You ordered "+quantity+" oranges. Thats's "+ dozen +" dozen at euro 4.50 per dozen and last "+last+" oranges at 45 cents each for a total of "+total+" euros");
	}
}