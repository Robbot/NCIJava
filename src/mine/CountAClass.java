package mine;
import javax.swing.JOptionPane;
public class CountAClass {
	public static void main(String args[]){
		String name;
		int count;
		
		CountA myCountA  =  new CountA();
		
		name = JOptionPane.showInputDialog(null,"Please provide an input string");
		myCountA.setName(name);
		
		myCountA.compute();
		
		count = myCountA.getCount();
		
		JOptionPane.showInputDialog(null,"The letter A appears "+count+" times in the name");
	}
}
