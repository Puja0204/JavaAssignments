package javaAssignments;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the String here");

		// It will accept String from user and will store in variable
		String str1 = scan.next();

		System.out.println("enter the latter to count");

		// It will accept char from user and will store in variable
		String str2 = scan.next();

		// Now from Second String get the value using charAt method
		char cha = str2.charAt(0);

		// take count variable
		int count = 0;

		// Run a for loop that will run based on String length
		for (int i = 0; i < str1.length() - 1; i++) {

			// This will check if match found
			if (str1.charAt(i) == cha)

			{

				// It will increment the counter
				count++;

			}
			scan.close();

		}

		// Finally print the count
		System.out.println("No. of string supplied are  " + count);

	}
}
