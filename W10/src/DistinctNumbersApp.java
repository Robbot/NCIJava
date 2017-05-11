public class DistinctNumbersApp {
  public static void main(String[] args) {
    int[] numbers = new int[10]; // numbers array will store distinct values, maximum is 10

    int numberOfDistinctValues = 0; // How many distinct numbers are in the
                                    // array
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter ten numbers: ");

    for (int i = 0; i < numbers.length; i++) {
      // Read an input
      int value = input.nextInt();

      int j = 0;
      for (j = 0; j < numberOfDistinctValues; j++)
        if (numbers[j] == value) {
          break; // It is in the numbers array, skip
        }

      // j == numberOfDistinctValues indicates that value is not in numbers array, add it to it
      if (j == numberOfDistinctValues) {
        numbers[numberOfDistinctValues] = value; // value is not in numbers array yet, store it
        numberOfDistinctValues++;
      }
    }


    System.out.println("The number of distinct values is " + numberOfDistinctValues);
   // for (int i = 0; i < numberOfDistinctValues; i++)
//      System.out.print(numbers[i] + " ");

   int[] Dnumbers = new int[numberOfDistinctValues]; // numbers array will store distinct values, maximum is 10

	for (int i = 0; i < numberOfDistinctValues; i++)
	  {
	    Dnumbers[i] = numbers[i];
	      System.out.println("Distinct numbers[" + "] = " + Dnumbers[i]);
    }
	DistinctNumbers metricsObj = new DistinctNumbers();
	metricsObj.setNumbers(Dnumbers);

	metricsObj.Sum();
	metricsObj.Average();
	metricsObj.Reverse();

	double a = metricsObj.getSum();
	System.out.println("Sum: " + a);

	double b = metricsObj.getAverage();
	System.out.println("average: " + b);
  }
}
