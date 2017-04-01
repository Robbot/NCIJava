
public class innerLoopTest {
	public static void main (String[] args) {
		
	int n, m; n = 2; m = 3;
	for (int i = 1; i <= n; i++) {
	System.out.println("outer: " + i);
	for (int j = 1; j <= m; j++) {
	System.out.println(" inner: " + j);
	}
	System.out.println();
	}
	}
}
