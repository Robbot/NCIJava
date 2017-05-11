public class DistinctNumbers {

private int numbers[]; // array to store the numbers
private int Reversenumbers[]; // array to store the numbers
private double sum;
private double average; // to store the average value of the numbers from the array -- to be computed

public void setNumbers(int numbers[]){
		this.numbers = numbers;
		this.Reversenumbers = numbers;
	}

    // processing method: compute the average of all the numbers from the array
	public void Sum(){
	    // declare local variables

		int currentElement; // to store the current element from the array

		sum = 0;
		for (int i = 0; i < numbers.length; i++){
			sum = sum + numbers[i];
		}
	}

	public void Average(){
	    // declare local variables
		int Temp_sum; // to store the sum of all the elements from the array
		int currentElement; // to store the current element from the array

		Temp_sum = 0;
		for (int i = 0; i < numbers.length; i++){
			Temp_sum = Temp_sum + numbers[i];
		}

        // compute the average (we type cast one of the operands to double so there is an accurate result for the average, otherwise an integer division would be performed)
		average = (double) Temp_sum/numbers.length;
	}

	public void Reverse(){
	for (int i = 0, j = Reversenumbers.length - 1; i < Reversenumbers.length / 2; i++, j--)
	   {
		   int temp 		 = Reversenumbers[i];
	       Reversenumbers[i] = Reversenumbers[j];
	       Reversenumbers[j] = temp;
       }

       for (int i = 0; i < Reversenumbers.length; i++)
       System.out.println("Reversenumbers [" + i + "] = " + Reversenumbers[i]);
	}

    // getter method to retrieve the sum
	public double getSum(){
		return sum;
	}

    // getter method to retrieve the average
	public double getAverage(){
		return average;
	}

}
