package OverloadedMethods;

public class Calculator {
	private double ans;
	
	public Calculator(){
		ans= 0.0;
	}
	//overloaded method - YOU MUST HAVE DIFFERENT PARAMETERS FOR EACH OF THEM
	public double division (int x, int y){
		ans = x/y;
		return ans;
	}
	
	
	public double division (double x, double y){
		ans = x/y;
		return ans;
	}
	
	public double division (double x, int y){
		ans = x/y;
		return ans;
				
	}
	
	public int division (int x, double y){
		ans = x/y;
		return (int)ans;
	}
}
