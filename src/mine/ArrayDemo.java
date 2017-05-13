package mine;
import java.util.Scanner;

public class ArrayDemo {
   public static void main(String [] args) {
	int array[], value, i;
	Scanner input = new Scanner(System.in);
	
	array=new int[5];
	for (i=0;i<5;i++) {
		System.out.println("Enter " + i + " integer to put it into array: ");
		value=input.nextInt();
		array[i]=value;
	}

	System.out.println("the first integer and the last integer are: " + array[0]+" and "+array[4]);
   }
}