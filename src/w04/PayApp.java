/** 

PayApp.java - the class takes input from the user, uses the instantiable class Pay to peform the actual processing that is payment computation, and displays the results:
	1) uses the instantiable class Pay to create an object of type Pay
	2) takes input from the user 
	3) uses the setter methods of the Pay object to store the values provided by the user into the corresponding instance variables of the object
	3) uses the method of Pay object (i.e. calls/invokes its method) calculatePayment() to compute the actual payments
	4) uses the getter methods of the Pay object to retrieve all the computed payments, and displays those values 

@author a e chis
*/
package w04;
import java.util.Scanner;

// declare the class PayApp
public class PayApp{
	
	// declare the main method
	public static void main(String[] args){
		// declare local variables
		double pay, standardH, overtimeH;

		// declare a variable of type Scanner named input to be able to work with an object of type Scanner
		Scanner input;
		// create an object of type Scanner to allow input from the keyboard
		input = new Scanner(System.in);
		
		// 1. declare a variable of type Pay named payment, and 2. create an object of type Pay
		Pay payment = new Pay();


		// input
		// read the values from the keyboard
		System.out.println("enter basic pay rate");
		pay = input.nextDouble();
		
		// call the setter methods to assign/store the values provided by the user into the object's instance variables
		// set/update the value of the object's instance variable called basicPay with the value provided via the keyboard
		payment.setBasicPay(pay);
		
		
		System.out.println("enter the number of standard hours");
		standardH = input.nextDouble();
		
		// set/update the value of the object's instance variable called standardHours with the value provided via the keyboard
		payment.setStandardHours(standardH);
		

		System.out.println("enter the number of overtime hours");
		overtimeH = input.nextDouble();
		
		// set/update the value of the object's instance variable called overtimeHours with the value provided via the keyboard
		payment.setOvertimeHours(overtimeH);
		

		// processing
		payment.calculatePayment();


		// output
		// first, retrieve/get each payment value using the corresponding getter method
		// second, display each result

		// declare a variable to store the standard payment
		double p;
		// use the getter method to retrieve/get the standard payment
		p = payment.getStandardPay();
		// display the standard payment
		System.out.println("standard payment: " + p);

		// remark: we have already displayed the standard payment, therefore we can use the same variable p to store another value in it (i.e. the current value of the variable p is going to be overwritten)
		// use the getter method to retrieve/get the overtime payment, and then store that value in the variable p
		p = payment.getOvertimePay();
		System.out.println("Overtime payment: " + p);

		// use the getter method to retrieve/get the total payment, and then directly display it
		p = payment.getTotalPay();
		System.out.println("total pay: " + p);
	
	} 
}
