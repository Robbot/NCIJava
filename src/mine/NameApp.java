package mine;
import javax.swing.JOptionPane;
public class NameApp {
	public static void main(String args[]){
		//declare variables
		String name;
		int len;
		char firstLetter, lastLetter;
		
		//declare & create object
		Name myName = new Name();
		
		//input
		name = JOptionPane.showInputDialog(null, "Please enter your name");
		myName.setName(name);
		//process
		myName.compute();
		
		//output
		len = myName.getLen();
		firstLetter = myName.getFirstLetter();
		lastLetter = myName.getLastLetter();
		JOptionPane.showMessageDialog(null, "Your name has "+len+" letters. The first letter is "+firstLetter+" and the last letter is "+lastLetter);
	}
}
