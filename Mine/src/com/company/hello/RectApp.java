package com.company.hello;
import java.util.*;
public class RectApp {
	public static void main(String[] args){
		double height;
		double width;
		double area;
		Scanner sc;
		Rect myRect;
		
		sc = new Scanner(System.in);
		myRect = new Rect();
		
		System.out.println("Enter width of rectangular: ");
		width = sc.nextDouble();
		myRect.setWidth(width);
		
		System.out.println("Enter height of rectangular: ");
		height = sc.nextDouble();
		myRect.setHeight(height);
		
		myRect.compute();
		
		area = myRect.getArea();
		System.out.println("The area of rectangular is: "+area);
	}
}
