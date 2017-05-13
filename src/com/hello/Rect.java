package com.hello;

public class Rect {
	//decalaration of variables
	private double height;
	private double width;
	private double area;
	
	//constructor
	public Rect(){
		height=0;
		width=0;
	}
	
	//set method - one for each value
	public void setHeight(double height){
		this.height = height;
	}
	public void setWidth(double width){
		this.width = width;
	}

	//compute - process
	public void compute(){
		area = height*width;
	}
	
	//get method
	public double getArea(){
		return area;
	}
}
