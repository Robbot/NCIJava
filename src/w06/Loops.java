package w06;
/**
SumLoop.java
	calculates the sum of all the numbers from 1 to n using
		-- a while loop
		-- a for loop

@author HDCOMP students and a e chis */

import java.util.concurrent.TimeUnit;
//import java.lang.Thread;

public class Loops{
	public static void main(String args[]){

		int n, m; n = 3; m = 3;

			for (int i = 2; i <= n; i++)  {
			    System.out.println("outer: " + i);
			    //TimeUnit.SECONDS.sleep(1);

                  for (int j = 1; j <= m; j++)
                      {
			             System.out.println("   inner: " + j);
                      }
               System.out.println();
}


	} // ends body of the main

} // ends body of class


