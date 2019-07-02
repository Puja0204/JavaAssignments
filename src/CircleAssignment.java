package javaAssignments;

import java.util.Scanner;

public class CircleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Default Constructor
		Circle c = new Circle();
		c.setRadius(6.2);
		c.setColor("Pink");
		double area = c.Area(c.getRadius());
		System.out.println("Radius of Circle is " + c.getRadius() + " And Color is " + c.getColor());
		System.out.println("Area of Circle is calulated as " + area);

		// Parameterized Constructor
		Circle c1 = new Circle("Red", 5);
		double area1 = c1.Area(c1.getRadius());
		System.out.println("Area of Circle1 is calulated as " + area1);

		// Input from User using Scanner method.
		Circle c2 = new Circle();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle ");
		String value = s.next();
		double area2 = c2.Area(Float.parseFloat(value));
		System.out.println("Area of Circle2 is calulated as " + area2 +"with radius "+ c2.getRadius() +" and color is " + c2.getColor());
		s.close();

		Circle c3 = new Circle();
		c3.setRadius(3.2);
		c3.setColor("Yellow");
		double area3 = c3.Area(c3.getRadius());
		System.out.println(
				"Area of Circle is " + area3 + " having radius " + c3.getRadius() + " and color is " + c3.getColor());
	

	}

}
