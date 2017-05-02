import javax.swing.JOptionPane;
public class Result2App {
	public static void main(String arg[]){
		int arr [];
		arr = new int[5];
		
		for(int i=0; i<5; i++){
		arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a result"));
		}
		for (int i=0; i< arr.length; i++){
			JOptionPane.showMessageDialog(null, arr[i]);
		}
		
	}
}

