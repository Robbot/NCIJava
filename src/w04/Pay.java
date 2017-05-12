/**
Pay.java 
	-- instantiable class to compute the standard payment, overtime payment and total payment
	
@author a e chis

*/
package w04;
// declare the instantiable class named Pay
public class Pay{
	// declare the instance variables	
	private double basicPay; // will store the basic pay rate
	private double standardHours; // will store the number of standard hours
	private double overtimeHours; // will store the number of overtime hours
	
	
	private double standardPay; // will store the standard payment -- to be computed
	private double overtimePay; // will store the overtime payment -- to be computed
	private double totalPay; // will store the total payment -- to be computed

	
	/*************************constructors***************************/
	// declare constructors
	// declare the constructor without parameters
	public Pay(){
		// all the instance variables are initialized 
		// with their default values. in this case 0.0 because all the variables are of type double.	
	}
	

	/****************************setter methods************************/
	// declare setter methods
	// declare one setter method for each instance variable the users of this class should provide values for. note that the users of this class are other classes (i.e. the classes that reuse this instantiable class, for example PayApp class)
	
	// declare a setter method to set the value of the basicPay instance variable
	public void setBasicPay(double pay){
		// stores the value of the parameter pay in the basicPay instance variable
		this.basicPay = pay;
	}
	
	// declare a setter method to set the value of the standardHours instance variable
	public void setStandardHours(double standardHours){
		// stores the value of the parameter standardHours in the standardHours instance variable (i.e. this.standardHours)
		this.standardHours = standardHours;
	}
	
	// declare a setter method to set the value of the overtimeHours instance variable
	public void setOvertimeHours(double overtime){
		// stores the value of the parameter overtime in the overtimeHours instance variable
		this.overtimeHours = overtime;
	}

	
	/****************************getter methods************************/
	// declare getter methods
	// declare one getter method for each instance variable whose value should be made available to the other classes

	// declare a getter method to be able to retrieve/get the standard payment
	public double getStandardPay(){
		return standardPay;
	}
	
	// declare a getter method to be able to retrieve/get the overtime payment
	public double getOvertimePay(){
		return overtimePay;
	}
	
	// declare a getter method to be able to retrieve/get the total payment
	public double getTotalPay(){
		return totalPay;
	}


	/****************************processing methods************************/
	// declare a processing method to compute the different payments
	public void calculatePayment(){
		// calculate the standard payment
		standardPay = basicPay * standardHours;

		// calculate the overtime payment
		// remark: the problem says that the overtime rate is 1.5 times the basic rate of pay
		overtimePay = 1.5 * basicPay * overtimeHours;

		// calculate the total payment
		totalPay = standardPay + overtimePay;		
	}	
}
