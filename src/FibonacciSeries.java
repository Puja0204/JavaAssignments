package javaAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int t1 = 0;
		int t2 = 1;
		int sum = 0;

		System.out.print("First " + n + " nos is: ");

		// for (int i = 0; i <= n; ++i) // by incrementing the value of i using for loop

		while (t1 <= n)// fibonaacii series to calculate till the given nos.
		{
			System.out.print(" + " + t1);
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
