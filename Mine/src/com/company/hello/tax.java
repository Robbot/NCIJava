package com.company.hello;

public class tax
	{
	//create the score variable for the game
	public static double subtotal;
	
	public static void main(String[]  args) {
		//create variable
		subtotal = 15.00;
		
		System.out.println("Subtotal: " + subtotal);
		
		double total = subtotal + calculateTax(0.08, subtotal);
		
		System.out.println("Total: " + total);
	}
	
	public static double calculateTax(double taxRate, double amountToTax) {
		double tax = amountToTax * taxRate;
		System.out.println("Tax: " + tax);
		
		return tax;
	}

}