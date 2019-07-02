package javaAssignments;

public class PrintNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer1;
		integer1 = 0;
		boolean divisibleby3 = (integer1 / 3) == 0;
		boolean divisibleby5 = (integer1 / 5) == 0;
		boolean divisibleby10 = (integer1 / 10) == 0;

		for (integer1 = 0; integer1 <= 15; integer1++) {

			if (divisibleby3) {
				System.out.println("abc didvide by 3 :" + integer1);
			}
			if (divisibleby5) {
				System.out.println("def didvide by 5 :" + integer1);
			}
			if (divisibleby10) {
				System.out.println("abcdef didvide by 10 :" + integer1);
			}
		}

	}
}
