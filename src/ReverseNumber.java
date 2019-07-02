package javaAssignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nos = 0;
		int rev = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number to reverse " );
		nos = s.nextInt();

		for (;nos != 0;) {

			rev = rev * 10;
			rev = rev + nos % 10;
			nos = nos / 10;
		}
		System.out.println("Reverse Of Input Nos is " + rev);
		s.close();
	}

}
