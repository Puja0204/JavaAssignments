package javaAssignments;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");

		int num = s.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		s.close();

	}

}
