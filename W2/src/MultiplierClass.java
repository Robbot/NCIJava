import java.util.Scanner;
public class MultiplierClass {

    // declare the main method
	public static void main(String args[]){
		// create a object sc Scanner
		Scanner sc;
		sc = new Scanner(System.in);

        // declare variables		
		String name; int age;
		
		System.out.println("Please enter your name: ");
		name = sc.nextLine();
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		System.out.println("Hello " + name +  " you are " + age + " years old");
	}
}
