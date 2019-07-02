package javaAssignments;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter nos to check if its prime or not ");
		n = s.nextInt();
		boolean isPrime = false;

		for (int i = 2; i <= n / 2; ++i) {

			if (n % i == 0) {
				isPrime = true;
				break;
			}

		}
		if (!isPrime)
			System.out.println(n + " is Prime Nos");
		else
			System.out.println(n + " is not prime nos");
		s.close();
	}

}
