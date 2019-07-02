package javaAssignments;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int armno = 153;
		int remainder = 0;
		int temp = 0;
		int originalnos = armno;

		while (originalnos != 0) {

			remainder = originalnos % 10;
			temp += Math.pow(remainder, 3);
			originalnos /= 10;

		}
		if (armno == temp)
			System.out.println("Armstrong");
		else
			System.out.println("Palindrome");

	}

}
