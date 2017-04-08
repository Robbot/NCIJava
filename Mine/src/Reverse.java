import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.println("Enter a word: ");
		word = sc.next();
		
		int length = word.length();
		
		for (int i = length-1; i>=0; i--) {
			
			char c = word.charAt(i);
			System.out.print(c);
		}
		
		
		
	}

}
