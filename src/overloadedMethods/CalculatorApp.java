package overloadedMethods;

public class CalculatorApp {
	public static void main(String[] args){
		
		double ans;
		Calculator c = new Calculator();
		
		//division of two integers
		ans = c.division(20, 5);
				System.out.println("Division with two integers "+ans);
		
				
		//division of two doubles
		ans = c.division(20.5, 5.5);
		System.out.println("Division with two doubles "+ans);
		
		//division of one double and one integer
		ans = c.division(20.5, 5);
		System.out.println("Division with one double and one integer "+ans);
		
		//division with one integer and one double
		ans = c.division(20, 5.5);
		System.out.println("Division with one integer and one double "+(int)ans );
	}

}
