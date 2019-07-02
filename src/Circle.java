package javaAssignments;

public class Circle {

	double radius;
	String color;

	Circle() {
		// System.out.println("This is a no argument constructor");
	}

	Circle(String color, float radius) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;

	}

	public void setRadius(double r) {
		radius = r;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;

	}

	public double Area(double radius) {

		double area = (radius * radius * Math.PI);

		return area;

	}

}
