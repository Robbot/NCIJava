import javax.swing.*;

public class Theatre1 {
	public static void main(String args[]){
		//declare variables
		String day;
		double cost;
		
		//input
		day = JOptionPane.showInputDialog(null, "Please enter the day of the week");
		
		//process and output
		if(day.equalsIgnoreCase("Monday")||day.equals("Tuesday")||day.equals("Wednesday")){
			JOptionPane.showMessageDialog(null, "The cost is 15 euro");
		}
		else {
			JOptionPane.showMessageDialog(null, "The cost is 50 euro");
		}
	}
}
