package mine;
import javax.swing.JOptionPane;
public class CinemaApp3 {
	public static void main(String args[]){
		//declare variables
		int age;
		
		//input
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"What is your age"));
				
		//process & output.
		if (age<5){
			JOptionPane.showMessageDialog(null, "You get free admission");
		}
			else if ((age>=5) && (age <=14)) {
				JOptionPane.showMessageDialog(null, "Your ticket will cost 5 euro");
		}
			else if ((age>=15) && (age <=65)) {
				JOptionPane.showMessageDialog(null, "Your ticket will cost 15 euro");
		}
			else {
			JOptionPane.showMessageDialog(null, "Your admission is free");
		}
	}
}
