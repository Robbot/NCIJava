import java.util.Scanner;
public class RadiusApp 
	{
		public static void main (String args []) {
			double radius, Area;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter radius: ");
			radius = input.nextDouble();
			Area CArea;
			CArea = new Area();
		System.out.println("Area of a circle is " + CArea.CircleArea(radius));
		}
	}