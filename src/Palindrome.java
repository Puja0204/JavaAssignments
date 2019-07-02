package javaAssignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pnos = 153;
		int revnos = 0;
		int remainder;
		int originalnos;

		originalnos = pnos;

		for (; pnos != 0; pnos /= 10) {
			remainder = pnos % 10;
			revnos = (revnos * 10) + remainder;

		}

		if (originalnos == revnos)
			System.out.println("nos is palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
