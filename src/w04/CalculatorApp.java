package w04;
import java.util.*;
public class CalculatorApp
    {

    public static void main (String[] args)
        {

			SimpleCalculator calc = new SimpleCalculator();
			int SumResult = calc.addTwoNumbers(8,4);
			int SubResult = calc.subTwoNumbers(8,4);
			int MulResult = calc.mulTwoNumbers(8,4);
			//int DivResult = calc.divTwoNumbers(8,4);
			System.out.println("Sum Result = " + SumResult);
			System.out.println("Subtract Result = " + SubResult);
			System.out.println("Multiply Result = " + MulResult);
			//System.out.println("Divide Result = " + calc.divTwoNumbers(8, 4));
			calc.divTwoNumbers(8, 4);

			//System.out.println("Sum = " + calc.addTwoNumbers(2,3));

		}

}