import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a word: ");
		
		MyClass cl =  new MyClass();
		String word = sc.next();
		int length = word.length();
		
		for (int i = length-1; i>=0; i--) {
			
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("The output is: "+word);
	}

}
