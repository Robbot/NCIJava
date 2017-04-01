import java.util.Scanner;
public class Airthmetic {
	public static void main(String args[]){
	// create a object sc Scanner
	Scanner sc;
	sc = new Scanner(System.in);
	// declare variables
		int firstNumber; int secondNumber; int result;
		
	System.out.println("Multiplication of integers ");
	System.out.println("Please enter first number: ");
	firstNumber = sc.nextInt();
	System.out.println("Please enter second number: ");
	secondNumber = sc.nextInt();
	
	//multiply of integer numbers
	result = firstNumber * secondNumber;
	
	//Displays the result
	System.out.println("Result of integer multiply is: " + result);
	//result of integer division
	result = firstNumber / secondNumber;
	System.out.println("Result of integer division is: " + result);	
	
	//result of double division
		double dblresult;
	dblresult = (double) firstNumber * (double) secondNumber;
	System.out.println("Result of double multiplication is: "+dblresult);
	dblresult = (double) firstNumber / secondNumber;
	System.out.println("Result of double division is: "+dblresult);
	
	//result = firstNumber / secondNumber;
	//System.out.println("Result of mixed division is "+result);
	
	}
}
