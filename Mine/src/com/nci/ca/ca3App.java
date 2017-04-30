package com.nci.ca;

import java.util.Scanner;

public class ca3App {

	public static void main(String[] args) {
		
		int num[];
		num = new int[10];
		
		Scanner sc = new Scanner (System.in);

		
        for (int i = 0; i< 10; i++){
        	
			System.out.println("Enter the numbers. The number:" + (i+1) + ": ");
			num[i] = sc.nextInt();
			
		}
        
        ca3 calcObj = new ca3();
        
        calcObj.setNumbers(num);
        
        System.out.println("The distinct number are: " + calcObj.findDistinct);
        }
}
