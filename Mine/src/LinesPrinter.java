import java.util.Scanner;

public class LinesPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word;
		
		System.out.println("Enter a word: ");
		word = input.next();
		
		int length = word.length();
		System.out.println("The word "+word+" has: "+ length + " characters");
		
	}

}
